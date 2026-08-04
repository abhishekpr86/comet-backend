package com.projectx.comet.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.comet.entity.User;

import jakarta.persistence.EntityManager;

@Service
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private  EntityManager entityManager;
	
	
	

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		
		return entityManager.find(User.class, id);
	}
	
	
	

}
