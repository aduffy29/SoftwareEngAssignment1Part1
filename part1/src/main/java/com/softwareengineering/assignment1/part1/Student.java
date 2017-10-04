package com.softwareengineering.assignment1.part1;

import org.joda.time.DateTime;

public class Student {
	private String name; 
	private String age;
	private DateTime dob;
	private String id;
	private String username;

	public Student(String name, String age, DateTime dob, String id) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;

	}
	
	public String getStudent() {
		return this.name + this.dob + this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAge(){
		return this.age;
	}
	
	public String getUsername(){
		return name + age;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public DateTime getDob() {
		return this.dob;
	}


	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
