package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.repository.user.UserJdbcRepositoryImpl;
import com.group.libraryapp.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceV1 {

  private final UserRepository userRepository;

    public UserServiceV1(@Qualifier("userJdbcRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//  public void saveUser(UserCreateRequest request) {
//      userRepository.saveUser(request.getName(), request.getAge());
//  }
//
//  public List<UserResponse> getUsers() {
//    return userRepository.getUsers();
//  }
//
//  public void updateUser(UserUpdateRequest request) {
//    if (userRepository.isUserNotExist(request.getId())) {
//      throw new IllegalArgumentException();
//    }
//
//      userRepository.updateUserName(request.getName(), request.getId());
//  }
//
//  public void deleteUser(String name) {
//    if (userRepository.isUserNotExist(name)) {
//      throw new IllegalArgumentException();
//    }
//
//      userRepository.deleteUser(name);
//  }

}
