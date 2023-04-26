package com.crs.kpmg.bean;

public class Professor {

	
	//remove the bean from the name

		
		
	    private String professorName;
	    private int professorCode;
	   // private ArrayList<Student> registeredStudents;
	    private final int maxStudents = 2;
	
		public String getProfessorName() {
			return professorName;
		}
		public void setProfessorName(String professorName) {
			this.professorName = professorName;
		}
		public int getProfessorCode() {
			return professorCode;
		}
		public void setProfessorCode(int professorCode) {
			this.professorCode = professorCode;
		}
	    
}

