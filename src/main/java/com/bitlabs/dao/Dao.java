package com.bitlabs.dao;

import java.util.List;

import com.bitlabs.entity.Jobs;
import com.bitlabs.entity.Users;

public interface Dao {

	public boolean addUser(Users user);
	public boolean login(String uname, String pwd);
	public boolean addJobDetails(Jobs job);
	public List<Users> getAllUsers();
	public List<Jobs> getAllJobs();

	
}
