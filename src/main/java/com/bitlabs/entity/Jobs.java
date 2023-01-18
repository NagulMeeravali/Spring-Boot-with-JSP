package com.bitlabs.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Jobs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String jobname;
	private String description;
	private String recurrance_id;
	private Date startdate;
	private Date enddate;
	private String duration;
	private String task_name;
	private java.util.Date created_at;
	
	
	@PrePersist
	public void onCreate() {
		created_at=new java.util.Date();
	}


	public String getJobname() {
		return jobname;
	}


	public void setJobname(String jobname) {
		this.jobname = jobname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	

	public String getRecurrance_id() {
		return recurrance_id;
	}


	public void setRecurrance_id(String recurrance_id) {
		this.recurrance_id = recurrance_id;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	

	

	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getTask_name() {
		return task_name;
	}


	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}


	public int getId() {
		return id;
	}


	public Date getCreated_at() {
		return (Date) created_at;
	}
	
}
