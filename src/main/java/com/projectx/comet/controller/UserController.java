package com.projectx.comet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.comet.entity.User;
import com.projectx.comet.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"http://localhost:5173","https://comet-frontend.up.railway.app"})
public class UserController {
	
	@Autowired
	public UserService userservice;
	
	@GetMapping("/{id}")
	public User findbyId(@PathVariable Long id) {
		
		return userservice.findById(id);
		
	}

}
