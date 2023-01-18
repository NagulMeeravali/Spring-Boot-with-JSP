package com.bitlabs.dao;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.entity.Jobs;
import com.bitlabs.entity.Users;


public class DaoImpl implements Dao {

	SessionFactory sf=null;
	
	public DaoImpl() {
	sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Override
	public boolean addUser(Users user) {
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.save(user);
		
		txn.commit();
		
		session.close();
		
		return true;
	}

	@Override
	public boolean login(String uname, String pwd) {
		  boolean b=false;
		Session session=sf.openSession();
		Query query=session.createQuery("from Users where username='"+uname+"' and password='"+pwd+"'");
		List<Users> user=query.list();
		if(user.size()!=0) {
			b=true;
		}
		session.close();
		return b;
	}

	@Override
	public boolean addJobDetails(Jobs job) {
		
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.save(job);
		
		txn.commit();
		
		session.close();
		return true;
	}

	@Override
	public List<Users> getAllUsers() {
		
		Session session=sf.openSession();
		List<Users> users=new ArrayList<Users>();
		Query query=session.createQuery("from Users");
		users=query.list();
		
		
		session.close();
		
		return users;
	}

	@Override
	public List<Jobs> getAllJobs() {
		
		Session session=sf.openSession();
		List<Jobs> jobs=new ArrayList<Jobs>();
		Query query=session.createQuery("from Jobs");
		jobs=query.list();
		
		
		session.close();
		
		return jobs;
	}

	
	
	
	
	

}
