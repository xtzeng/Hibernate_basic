package com.immutable.alias.model;

import java.util.Date;


public class Student {
	
/*	private Long id;
	private String name;*/
	
	private StudentPK pk;
	
	private int age;
	private boolean good;
	private Date lastUpdateTime;
	

	
	
	
		
	

/*	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public StudentPK getPk() {
		return pk;
	}
	public void setPk(StudentPK pk) {
		this.pk = pk;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	
	
	
}
