package com.group.libraryapp.repository.user.loanhistory;

import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

  // select * from user_loan_history where book_name = ? and is_return = ?
  boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

  // select * from user_loan_history where user_id = ? and book_name = ?
  Optional<UserLoanHistory> findByUserIdAndBookName(Long userId, String bookName);

}
