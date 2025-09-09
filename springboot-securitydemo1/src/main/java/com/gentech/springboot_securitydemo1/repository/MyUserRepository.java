package com.gentech.springboot_securitydemo1.repository;

import com.gentech.springboot_securitydemo1.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUserName(String username);
}
