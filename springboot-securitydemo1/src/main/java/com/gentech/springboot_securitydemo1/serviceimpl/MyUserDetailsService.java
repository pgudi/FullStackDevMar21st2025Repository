package com.gentech.springboot_securitydemo1.serviceimpl;

import com.gentech.springboot_securitydemo1.entity.MyUser;
import com.gentech.springboot_securitydemo1.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private MyUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> genericUser=repository.findByUserName(username);
        if(genericUser.isPresent())
        {
            MyUser user=genericUser.get();
            return User.builder()
                    .username(user.getUserName())
                    .password(user.getPassword())
                    .roles(getUserRoles(user))
                    .build();
        }
        else{
            throw new UsernameNotFoundException("User has not found!!");
        }

    }

    public String[] getUserRoles(MyUser user)
    {
        if(user.getRoles()==null){
            return new String[] {"USER"};
        }
        else{
            return user.getRoles().split(",");
        }
    }
}
