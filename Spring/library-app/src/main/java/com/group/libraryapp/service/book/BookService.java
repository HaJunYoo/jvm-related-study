package com.group.libraryapp.service.book;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory;
import com.group.libraryapp.repository.book.BookRepository;
import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.repository.user.UserRepository;
import com.group.libraryapp.repository.user.loanhistory.UserLoanHistoryRepository;
import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.book.request.BookLoanRequest;
import com.group.libraryapp.dto.book.request.BookReturnRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
//@RequiredArgsConstructor
public class BookService {

  private final BookRepository bookRepository;
  private final UserLoanHistoryRepository userLoanHistoryRepository;
  private final UserRepository userRepository;

  public BookService(
          BookRepository bookRepository,
          UserLoanHistoryRepository userLoanHistoryRepository,
          @Qualifier("userJdbcRepository") UserRepository userRepository
  ) {
    this.bookRepository = bookRepository;
    this.userLoanHistoryRepository = userLoanHistoryRepository;
    this.userRepository = userRepository;
  }

  @Transactional
  public void saveBook(BookCreateRequest request) {
    bookRepository.save(new Book(request.getName()));
  }

  @Transactional
  public void loanBook(BookLoanRequest request) {
    String bookName = request.getBookName();
    String userName = request.getUserName();
    log.info("대출 요청 시작: 사용자={}, 책={}", userName, bookName);

    // 1. 책 정보를 가져온다.
    Book book = bookRepository.findByName(bookName)
            .orElseThrow(() -> {
              log.error("책을 찾을 수 없습니다: {}", bookName);
              return new IllegalArgumentException("책을 찾을 수 없습니다");
            });
    log.debug("책 정보 조회 완료: {}", book.getName());

    // 2&3. 대출기록 정보를 확인해서 대출중인지 확인합니다.
    if (userLoanHistoryRepository.existsByBookNameAndIsReturn(book.getName(), false)) {
      log.warn("이미 대출된 책입니다: {}", bookName);
      throw new IllegalArgumentException("이미 대출되어 있는 책입니다");
    }

    // 4. 유저 정보를 가져온다.
    User user = userRepository.findByName(userName)
            .orElseThrow(() -> {
              log.error("사용자를 찾을 수 없습니다: {}", userName);
              return new IllegalArgumentException("사용자를 찾을 수 없습니다");
            });

//    user.loanBook(book.getName());
    UserLoanHistory loanHistory = new UserLoanHistory(user, book.getName());
    userLoanHistoryRepository.save(loanHistory);

    log.info("User의 대출 기록 크기: {}", user.getLoanHistorySize());
    log.info("대출 완료: 사용자={}, 책={}", userName, bookName);
  }

  @Transactional
  public void returnBook(BookReturnRequest request) {
    User user = userRepository.findByName(request.getUserName())
        .orElseThrow(IllegalArgumentException::new);
    System.out.println("Hello");
    user.returnBook(request.getBookName());
  }

}
