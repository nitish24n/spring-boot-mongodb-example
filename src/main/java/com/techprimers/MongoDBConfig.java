package com.techprimers;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
	
//	@Bean
//	CommandLineRunner commandLineRunner(UserRepository userRepo) {
//		return strings -> {
//			userRepo.insert(new Users("Nitish","Development",2500L));
//			userRepo.insert(new Users("Hello","Tiger",2300L));
//		};
//	}
}
