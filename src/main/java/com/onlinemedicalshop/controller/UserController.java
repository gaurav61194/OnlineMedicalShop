package com.onlinemedicalshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemedicalshop.entity.User;
import com.onlinemedicalshop.services.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getuser")
	public User getAllUser(@PathVariable User user){
		return userService.getUser(user);
	}
	
//	@PostMapping("/signup")
//	public User addUser(@RequestBody User user) throws Throwable{
//		return userService.signupUser(user);
//	}
	
//	@GetMapping("/login")
//	public ResponseEntity<User> login(@RequestParam String emailId, String password) throws Throwable{
//	return userService.loginUser(emailId, password);
//	}

}

