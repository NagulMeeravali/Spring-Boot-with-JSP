package com.bitlabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.dao.Dao;
import com.bitlabs.dao.DaoImpl;
import com.bitlabs.entity.Users;

@Controller
public class UserController {
     
	Dao dao=new DaoImpl();
	
	
	// http://localhost:8080
	@GetMapping("/")
   public String home() {
	   
		return "index";
   }
	// http://localhost:8080/register
	@GetMapping("/register")
	public String registerPage() {
		
		return "Register";
	}
	
	@PostMapping("/userRegistration")
	public String addUser(@ModelAttribute("user") Users user) {
		dao.addUser(user);
		return "index";
	}
	
	@PostMapping("/reqLogin")
	public String login(@ModelAttribute("user") Users user) {
		boolean b=dao.login(user.getUsername(), user.getPassword());
		if(b) {
		return "JobDetails";
		}
		else {
			return "Error";
		}
	}
	
	//http://localhost:8080/getAllusers
	@GetMapping("/getAllUsers")
	public ModelAndView getAllUsers() {
		
		List<Users> al=dao.getAllUsers();
		
		ModelAndView mav=new ModelAndView("JobDetails");
		mav.addObject("users",al);
		
		return mav;
		
	}
	
	
	
}
