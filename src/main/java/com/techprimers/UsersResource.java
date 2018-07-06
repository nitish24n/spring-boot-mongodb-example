package com.techprimers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/rest/users")
public class UsersResource {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Users> getAll(){
		System.out.println("all documents returned successfully");
		return userRepository.findAll();
	}	
	
	@RequestMapping(value="/save", method=RequestMethod.POST/*, headers = {"content-type=application/json"}*/)
	public String insertUser(@RequestBody Users user) {
		
		Users user1 = userRepository.save(user);
		
		System.out.println(user1.getTeamName());
		return "Inserted Successfully";
		
	}
}
