package com.valdosm.course;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdosm.course.entities.User;
import com.valdosm.course.repository.UserRepository;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Odair", "odair@jos.com", "25478451", "3245@");
		User user2 = new User(null, "Edivaldo", "valdosm.moriera@gmail.com", "25478451", "3245@");
		User user3 = new User(null, "carlos", "carlos@hmail.com", "88263653", "000000@");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));

						

	}

}
