package com.gentech.security.repository;

import com.gentech.security.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
   Optional<MyUser> findByUserName(String username);
}
