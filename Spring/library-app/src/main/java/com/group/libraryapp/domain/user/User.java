package com.group.libraryapp.domain.user;

import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

  @Getter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @Getter
  @Column(nullable = false, length = 20)
  private String name;

  @Getter
  private Integer age;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserLoanHistory> userLoanHistories = new ArrayList<>();

  public List<UserLoanHistory> getUserLoanHistories() {
    return this.userLoanHistories;
  }

  public int getLoanHistorySize() {
    return this.userLoanHistories.size();
  }

  // 기존 orm 생성자
  public User(String name, Integer age) {
    checkUserNameNull(name);

    this.name = name;
    this.age = age;
  }

  // JdbcTemplate용 생성자 추가
  public User(String name, Integer age, Long id) {
    checkUserNameNull(name);

    this.name = name;
    this.age = age;
    this.id = id;
  }

  public void updateName(String name) {
    this.name = name;
  }

  public void loanBook(String bookName) {
    UserLoanHistory history = new UserLoanHistory(this, bookName);
    this.userLoanHistories.add(history);
  }

  public void returnBook(String bookName) {
    UserLoanHistory targetHistory = this.userLoanHistories.stream()
        .filter(history -> history.getBookName().equals(bookName))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
    targetHistory.doReturn();
  }

  private void checkUserNameNull(String name) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
    }
  }

}
