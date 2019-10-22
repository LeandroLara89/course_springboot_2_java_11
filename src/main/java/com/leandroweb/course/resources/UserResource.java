package com.leandroweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandroweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping 
	 public ResponseEntity<User> findAll(){
		 User u = new User(1L, "Maria", "maria@gmail.com", "21993949594", "145789898"); 
		 return ResponseEntity.ok().body(u);
	 }
}
