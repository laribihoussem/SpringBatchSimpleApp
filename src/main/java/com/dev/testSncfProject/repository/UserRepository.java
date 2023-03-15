package com.dev.testSncfProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.testSncfProject.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
