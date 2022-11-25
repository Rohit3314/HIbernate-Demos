package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject 
{

	private String subname;
	private int marks;
	@Id
	private int sid;
	
	public Subject() {
		super();
		
	}
	public Subject(String subname, int marks, int sid) {
		super();
		this.subname = subname;
		this.marks = marks;
		this.sid = sid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}
