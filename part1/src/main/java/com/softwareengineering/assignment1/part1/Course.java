package com.softwareengineering.assignment1.part1;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	private ArrayList<Module> moduleList;
	private DateTime start;
	private DateTime end;
	
	public Course(String courseName, ArrayList<Module> moduleList, DateTime start, DateTime end){
		this.courseName = courseName;
		this.moduleList = moduleList;
		this.start = start;
		this.end = end;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(ArrayList<Module> moduleList) {
		this.moduleList = moduleList;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
	
}
