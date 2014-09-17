package com.immutable.alias.model;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import com.immutable.alias.constant.Gender;


@Entity
@Table(name="teacher")
@TableGenerator(name="inventory",
	table="U_SEQUENCES",
	pkColumnName = "S_ID",
	valueColumnName = "S_NEXTNUM",
	pkColumnValue = "inventory",
	allocationSize = 1000)
public class Teacher {
	

	
	private int id;
	private String name;
	private String title;
	private Date lastUpdateTime;
	
	
	private String yourWifeName;
	private boolean good;
	private Gender gender;
	
	private String length;
	
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE
    ,generator="inventory")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="last_update_time")
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	@Transient
	public String getYourWifeName() {
		return yourWifeName;
	}
	public void setYourWifeName(String yourWifeName) {
		this.yourWifeName = yourWifeName;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Basic(optional=true) //optional:表示该属性是否允许为null,默认为true 
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	
	
	
	
	
	
}
