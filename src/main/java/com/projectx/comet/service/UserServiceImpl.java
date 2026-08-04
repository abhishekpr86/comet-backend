package com.projectx.comet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.comet.entity.User;
import com.projectx.comet.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userdao ;

	@Override
	public User findById(Long id) {
	
		User us = userdao.findById(id);
		
		if (us==null) {
			throw new RuntimeException(
				
					"User not found with ID: " + id
					
					);
		}
	
		return us;
		
		
		}
		

}
