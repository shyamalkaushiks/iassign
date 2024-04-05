//package com.shyamal.runner;
//
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.shyamal.models.Person;
//import com.shyamal.models.PhoneNumber;
//import com.shyamal.service.Iservice;
//@Component
//public class Runner implements CommandLineRunner {
//	@Autowired
//	public Iservice ser;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Person p=new Person();
//		p.setPname("shyamal");
//		p.setPaddress("alwar");
//		
//		
//		// Create a child object
//		PhoneNumber p1 = new PhoneNumber(9998887775L, "airtel", "office");
//		PhoneNumber p2 = new PhoneNumber(8889997775L, "jio", "residence");
//		
//		p.setContactDetails(Set.of(p1,p2));
//		p1.setPerson(p);
//		p2.setPerson(p);
//		
//		//link parent to child
//
//
//		Set<PhoneNumber> contactDetails = Set.of(p1, p2);
//		System.out.println(ser.saveperson(p));
//		System.out.println(ser.savephonenumber(contactDetails));
//
//		
//		
//	}
//
//}
