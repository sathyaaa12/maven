package com.college;

public class Dept extends Hostel {
	public void deptName() {
		System.out.println("student dept EcE");
		
	}
	public static void name(String[] args) {
		Dept c = new Dept();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.studentName();
		c.studentId();
		c.studentDept();
		c.hostelName();
		c.deptName();
		
	}

}
