package com.tricon.demoSpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricon.demoSpringMongo.model.Users;

@Repository
public interface UserRepo extends MongoRepository<Users, String>{

}
