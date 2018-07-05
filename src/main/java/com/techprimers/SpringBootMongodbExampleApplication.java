package com.techprimers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongodbExampleApplication {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbExampleApplication.class, args);
	}
	
//	@Override
//	public void run(String... args) throws Exception {
//
//		userRepository.deleteAll();
//
//		// save a couple of customers
//		userRepository.save(new Users("Alice", "Smith",2500L));
//		userRepository.save(new Users("Bob", "Smith",1000L));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Users customer : userRepository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//		
//	}
}
