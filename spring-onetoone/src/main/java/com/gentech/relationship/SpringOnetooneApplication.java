package com.gentech.relationship;

import com.gentech.relationship.entity.UserProfile;
import com.gentech.relationship.entity.Users;
import com.gentech.relationship.repository.UserProfileRepository;
import com.gentech.relationship.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetooneApplication.class, args);
	}

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {

		Users user1=new Users();
		user1.setUserName("Santosh");
		user1.setJobName("Manager");

		UserProfile profile=new UserProfile();
		profile.setEmailId("santosh@gmail.com");
		profile.setPhoneNo("987-123-567");
		profile.setSalary(34000.00);
		profile.setLocation("BOSTON");

		user1.setUserProfile(profile);
		profile.setUsers(user1);

		usersRepository.save(user1);
	}
}
