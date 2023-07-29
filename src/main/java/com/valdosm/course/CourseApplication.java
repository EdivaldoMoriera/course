package com.valdosm.course;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdosm.course.entities.Order;
import com.valdosm.course.entities.User;
import com.valdosm.course.repository.OrderRepository;
import com.valdosm.course.repository.UserRepository;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Odair", "odair@jos.com", "25478451", "3245@");
		User user2 = new User(null, "Edivaldo", "valdosm.moriera@gmail.com", "25478451", "3245@");
		User user3 = new User(null, "carlos", "carlos@hmail.com", "88263653", "000000@");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1); 
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));

		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

						

	}

}
