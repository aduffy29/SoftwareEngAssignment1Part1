package com.softwareengineering.assignment1.part1;

import java.util.ArrayList;

public class Module {
	public String moduleName;
	public String moduleID;
	public ArrayList<Student> studentList;
	
	public Module(String moduleName, String moduleID, ArrayList<Student> studentList){
		this.moduleName = moduleName;
		this.moduleID = moduleID;
		this.studentList = studentList;
	}

	public String getModuleName() {
		return moduleName;
	}

	public String getModuleID() {
		return moduleID;
	}

	public ArrayList<Student> getStudents() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList=studentList;
	}
}
