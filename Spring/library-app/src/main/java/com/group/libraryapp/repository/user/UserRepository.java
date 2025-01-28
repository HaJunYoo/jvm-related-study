package com.group.libraryapp.repository.user;

import com.group.libraryapp.domain.user.User;

import java.util.List;
import java.util.Optional;

//public interface UserRepository extends JpaRepository<User, Long> {
//
//  Optional<User> findByName(String name);
//
//}

public interface UserRepository {
  void save(User user);
  List<User> findAll();
  Optional<User> findById(long id);
  Optional<User> findByName(String name);
  boolean isUserNotExist(long id);
  boolean isUserNotExist(String name);
  void update(String name, long id);
  void delete(String name);
}