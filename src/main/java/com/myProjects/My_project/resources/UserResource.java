package com.myProjects.My_project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProjects.My_project.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Ana Fabia", "anaFC@gmail.com", "47960606060", "Senha");
		return ResponseEntity.ok().body(u);
	}
}
