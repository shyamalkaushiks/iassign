package com.shyamal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shyamal.models.User;
import com.shyamal.service.Iservice;



@Controller
public class iamcontroller {
	@Autowired
	public Iservice ser;
@GetMapping("/details")
	public String openform()
	{
	return "details";
	}
@PostMapping("/save-details")
public String saveDetails(@ModelAttribute("user") User user, Model model) {
    // Save the user details to the database
    User savedUser = ser.saveuser(user);
    
    List<User> usersGoingToJaipurOnSameDate = ser.getUsersGoingToSameDestinationOnSameDate("Jaipur", user.getTravelDate());
    
    // Add savedUser and usersGoingToJaipur to the model
    model.addAttribute("savedUser", savedUser);
    model.addAttribute("usersGoingToJaipur", usersGoingToJaipurOnSameDate); // Make sure the key is "usersGoingToJaipur"
    
    // Forward to the JSP page
    return "detailsuser";
}



}
