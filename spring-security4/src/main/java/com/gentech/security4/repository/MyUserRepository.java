package com.gentech.security4.repository;

import java.util.Optional;

import com.gentech.security4.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long>{
   Optional<MyUser> findByUsername(String username);
}
