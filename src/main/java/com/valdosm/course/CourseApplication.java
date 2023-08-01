package com.valdosm.course;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdosm.course.entities.Category;
import com.valdosm.course.entities.Order;
import com.valdosm.course.entities.Product;
import com.valdosm.course.entities.User;
import com.valdosm.course.entities.enums.OrderStatus;
import com.valdosm.course.repository.CategoryRepository;
import com.valdosm.course.repository.OrderRepository;
import com.valdosm.course.repository.ProductRepository;
import com.valdosm.course.repository.UserRepository;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Odair", "odair@jos.com", "25478451", "3245@");
		User user2 = new User(null, "Edivaldo", "valdosm.moriera@gmail.com", "25478451", "3245@");
		User user3 = new User(null, "carlos", "carlos@hmail.com", "88263653", "000000@");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, user2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, user1);

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		

		userRepository.saveAll(Arrays.asList(user1, user2, user3));

		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		

	}

}
