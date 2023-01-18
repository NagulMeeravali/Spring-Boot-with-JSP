package com.bitlabs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.dao.Dao;
import com.bitlabs.dao.DaoImpl;
import com.bitlabs.entity.Jobs;

@Controller
public class JobController {

	Dao dao=new DaoImpl();
	
	@PostMapping("/reqSaveJobDetails")
	public String addJobDetails(@ModelAttribute("job") Jobs job ) {
		
		dao.addJobDetails(job);
		
		return "JobDetails";
	}
	
	@GetMapping("/getAllJobs")
	public String getAllJobs() {
		
		List<Jobs> al=dao.getAllJobs();
		ModelAndView mav=new ModelAndView("JobDetails");
		mav.addObject("jobs",al);
		
		return "JobDetails";
	}
}
