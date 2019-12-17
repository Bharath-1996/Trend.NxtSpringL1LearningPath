package com;


import java.util.List;

public class Student {

	String studentId;
	String studentName;
	List<Test> studentTest;
   
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public List<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}
	@Override
	public String toString() {
		return "StudentId=" + studentId + ", StudentName=" + studentName + ", StudentTest=" + studentTest;
	}
	
	
	
}
