package com.tricon.demoSpringMongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.demoSpringMongo.model.Users;
import com.tricon.demoSpringMongo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
	public List<Users> listUsers(){
		
		return userRepo.findAll();
	}

	public Optional<Users> getOneUser(String id) {
		return userRepo.findById(id);
	}
	

	public Users updateUser( Users user) {
		
		String id = user.getId();
		
		return userRepo.save(user);
	}

	public String deleteUser(String id) {
		userRepo.deleteById(id);
		return "User with id "+id+" has been deleted successfully!";
		
	}

	public Users createUser(Users user) {
		return userRepo.save(user);
	}
}
