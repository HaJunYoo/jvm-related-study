package com.group.libraryapp.service.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.repository.user.UserJdbcRepository;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceV2 {

  private final UserRepository userRepository;
  private final UserJdbcRepository userJdbcRepository;

  public UserServiceV2(UserRepository userRepository, UserJdbcRepository userJdbcRepository) {
      this.userRepository = userRepository;
      this.userJdbcRepository = userJdbcRepository;
  }

  // 아래 있는 함수가 시작될 때 start transaction;을 해준다 (트랜잭션을 시작!)
  // 함수가 예외 없이 잘 끝났다면 commit
  // 혹시라도 문제가 있다면 rollback
//  @Transactional
//  public void saveUser(UserCreateRequest request) {
//    userRepository.save(new User(request.getName(), request.getAge()));
//  }
//
//  @Transactional(readOnly = true)
//  public List<UserResponse> getUsers() {
//    return userRepository.findAll().stream()
//        .map(UserResponse::new)
//        .collect(Collectors.toList());
//  }
//
//  @Transactional
//  public void updateUser(UserUpdateRequest request) {
//    User user = userRepository.findById(request.getId())
//        .orElseThrow(IllegalArgumentException::new);
//
//    user.updateName(request.getName());
//  }
//
//  @Transactional
//  public void deleteUser(String name) {
//    User user = userRepository.findByName(name)
//        .orElseThrow(IllegalArgumentException::new);
//
//    userRepository.delete(user);
//  }

  @Transactional
  public void saveUser(UserCreateRequest request) {
    userJdbcRepository.save(new User(request.getName(), request.getAge()));
  }

  @Transactional(readOnly = true)
  public List<UserResponse> getUsers() {
    return userJdbcRepository.findAll().stream()
            .map(UserResponse::new)
            .collect(Collectors.toList());
  }

  @Transactional
  public void updateUser(UserUpdateRequest request) {
    boolean isUserNotExist = userJdbcRepository.isUserNotExist(request.getId());

    if (isUserNotExist) {
      throw new IllegalArgumentException();
    }

    userJdbcRepository.update(request.getName(), request.getId());
  }

  @Transactional
  public void deleteUser(String name) {
    if (userJdbcRepository.isUserNotExist(name)) {
      throw new IllegalArgumentException();
    }
//    User user = userJdbcRepository.findByName(name)
//            .orElseThrow(IllegalArgumentException::new);
    userJdbcRepository.delete(name);
  }

}
