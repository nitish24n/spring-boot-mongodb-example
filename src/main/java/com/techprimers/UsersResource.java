package com.techprimers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/users")
public class UsersResource {
	@Autowired
	private UserRepository userRepository;
	

	
	@GetMapping("/rest/all")
	public List<Users> getAll(){
		System.out.println("all method..");
		return userRepository.findAll();
	}
	
	
	@RequestMapping(path="/insertUser", method=RequestMethod.POST)
	public String insertUser(Users user) {
		
		Users user1 = userRepository.save(user);
		System.out.println(user1);
		return "Inserted Successfully";
		
	}
	

}
