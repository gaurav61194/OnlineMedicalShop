package com.onlinemedicalshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinemedicalshop.entity.User;

import com.onlinemedicalshop.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(User user) {
		return userRepository.getEmailId(user.getEmailId());
	}

//	@Override
//	public User signupUser(User user) throws UserAlreadyExistsException {
//		return userRepository.save(user);
//	}

//	@Override
//	public ResponseEntity<User> loginUser(String emailId, String password) {
//		User user = userRepository.findByEmailId(emailId, password);
//		return null;
//	}

}
