package com.shyamal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.shyamal.models.User;
import com.shyamal.repository.repo;

@Service
public class Iserviceimpl implements Iservice {

	@Autowired
	private repo r;
	@Override
	public User saveuser(User user) {
		// TODO Auto-generated method stub
		User s =r.save(user);
	return s;
	}
	@Override
	public List<User> getUsersGoingToSameDestinationOnSameDate(String destination, Date travelDate) {
		// TODO Auto-generated method stub
		   return r.findUsersByDestinationAndTravelDate(destination, travelDate);
	}

	 
	
}