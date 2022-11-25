package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject 
{
	@Id
	private int subid; 
	private String subject;
	private int marks;
	                   
	@OneToOne(cascade=CascadeType.PERSIST)
	private Student stud;

	public Subject() {
		super();
	
	}

	public Subject(int subid, String subject, int marks, Student stud) {
		super();
		this.subid = subid;
		this.subject = subject;
		this.marks = marks;
		this.stud = stud;
	}

	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Student getStud() {
		return stud;
	}


	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	
	
	

}
