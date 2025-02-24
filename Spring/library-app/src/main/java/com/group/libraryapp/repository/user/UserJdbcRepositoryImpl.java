package com.group.libraryapp.repository.user;

import com.group.libraryapp.domain.user.User;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository("userJdbcRepository")
@Primary
public class UserJdbcRepositoryImpl implements UserRepository {

  private final JdbcTemplate jdbcTemplate;

  private final RowMapper<User> userRowMapper = (rs, rowNum) -> {
    long id = rs.getLong("id");
    String name = rs.getString("name");
    int age = rs.getInt("age");
    return new User(name, age, id);
  };

  public UserJdbcRepositoryImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Transactional(readOnly = true)
  public List<User> findAll() {
    String sql = "SELECT * FROM user";
    return jdbcTemplate.query(sql, userRowMapper);
  }

  @Transactional(readOnly = true)
  public Optional<User> findById(long id) {
    String sql = "SELECT * FROM user WHERE id = ?";
    List<User> users = jdbcTemplate.query(sql, userRowMapper, id);
    return users.isEmpty() ? Optional.empty() : Optional.of(users.get(0));
  }

  @Transactional(readOnly = true)
  public boolean isUserNotExist(long id) {
    String readSql = "SELECT * FROM user WHERE id = ?";
    return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, id).isEmpty();
  }

  @Transactional(readOnly = true)
  public boolean isUserNotExist(String name) {
    String readSql = "SELECT * FROM user WHERE name = ?";
    return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, name).isEmpty();
  }

  @Transactional(readOnly = true)
  public Optional<User> findByName(String name) {
    String sql = "SELECT * FROM user WHERE name = ?";
    List<User> users = jdbcTemplate.query(sql, userRowMapper, name);
    return users.isEmpty() ? Optional.empty() : Optional.of(users.get(0));
  }

  @Transactional
  public void save(User user) {
    String sql = "INSERT INTO user (name, age) VALUES (?, ?)";
    jdbcTemplate.update(sql, user.getName(), user.getAge());
  }

  @Transactional
  public void update(String name, long id) {
    String sql = "UPDATE user SET name = ? WHERE id = ?";
    jdbcTemplate.update(sql, name, id);
  }

  @Transactional
  public void delete(String name) {
    String sql = "DELETE FROM user WHERE name = ?";
    jdbcTemplate.update(sql, name);
  }
}

//@Repository
//public class UserJdbcRepository {
//
//  private final JdbcTemplate jdbcTemplate;
//
//  public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
//    this.jdbcTemplate = jdbcTemplate;
//  }
//
//  public boolean isUserNotExist(long id) {
//    String readSql = "SELECT * FROM user WHERE id = ?";
//    return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, id).isEmpty();
//  }
//
//  public void updateUserName(String name, long id) {
//    String sql = "UPDATE user SET name = ? WHERE id = ?";
//    jdbcTemplate.update(sql, name, id);
//  }
//
//  public boolean isUserNotExist(String name) {
//    String readSql = "SELECT * FROM user WHERE name = ?";
//    return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, name).isEmpty();
//  }
//
//  public void deleteUser(String name) {
//    String sql = "DELETE FROM user WHERE name = ?";
//    jdbcTemplate.update(sql, name);
//  }
//
//  public void saveUser(String name, Integer age) {
//    String sql = "INSERT INTO user (name, age) VALUES (?, ?)";
//    jdbcTemplate.update(sql, name, age);
//  }
//
//  public List<UserResponse> getUsers() {
//    String sql = "SELECT * FROM user";
//    return jdbcTemplate.query(sql, (rs, rowNum) -> {
//      long id = rs.getLong("id");
//      String name = rs.getString("name");
//      int age = rs.getInt("age");
//      return new UserResponse(id, name, age);
//    });
//  }
//
//}