package com.onlinemedicalshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlinemedicalshop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.emailId=?1")
	public User getEmailId(String emailId);
	
//	@Query("select u from User u WHERE u.emailId=?1 AND u.password=?1")
//	User findByEmailId(String emailId, String password);
	
}