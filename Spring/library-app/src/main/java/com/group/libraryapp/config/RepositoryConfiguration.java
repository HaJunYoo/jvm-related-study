package com.group.libraryapp.config;

import com.group.libraryapp.repository.user.UserRepository;
import com.group.libraryapp.repository.user.UserJdbcRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class RepositoryConfiguration {
    @Bean
    @Primary
    public UserRepository userRepository(JdbcTemplate jdbcTemplate) {
        return new UserJdbcRepositoryImpl(jdbcTemplate);
    }
}