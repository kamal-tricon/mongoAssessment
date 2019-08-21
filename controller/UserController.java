package com.tricon.demoSpringMongo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.demoSpringMongo.model.Users;
import com.tricon.demoSpringMongo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public Users CreateUsers(@Valid Users user) {
		
		return userService.createUser(user);
	}

	
	
	@GetMapping("/list")
	public List<?> listUsers(){
		
		return userService.listUsers();
		
	}
	
	@GetMapping("/list/{id}")
	public Optional<Users> getOneUser(@PathVariable("id") String id){
		
		return userService.getOneUser(id);
		
	}
	
	@PutMapping("/update/{id}")
	
	public Users update(Users user) {
		return userService.updateUser(user);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") String id) {
		
		return userService.deleteUser(id);
		
	}
}
