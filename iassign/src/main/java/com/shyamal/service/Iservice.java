package com.shyamal.service;
import java.util.*;
import com.shyamal.models.User;

public interface Iservice {
	public User saveuser(User user);
	 List<User> getUsersGoingToSameDestinationOnSameDate(String destination, Date travelDate);
}
