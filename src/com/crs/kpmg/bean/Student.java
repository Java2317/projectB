/**
 * 
 */
package com.crs.kpmg.bean;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class Student {
//remove bean from the name
	
	
	    private String studentName;
	    private int studentCode;
	   // private ArrayList<Student> registeredStudents;
	    private final int maxStudents = 2;
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getStudentCode() {
			return studentCode;
		}
		public void setStudentCode(int studentCode) {
			this.studentCode = studentCode;
		}
	    
}
