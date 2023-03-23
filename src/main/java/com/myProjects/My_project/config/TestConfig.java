package com.myProjects.My_project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myProjects.My_project.entities.Order;
import com.myProjects.My_project.entities.User;
import com.myProjects.My_project.repositories.OrderRepository;
import com.myProjects.My_project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Rita Mac", "rm@gmail.com", "48998989898", "Password"); 
		User u2 = new User(null, "Nilso Osn;", "No@gmail.com", "48996969696", "Password"); 
		
		Order o1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
