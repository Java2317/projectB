package com.crs.kpmg.client;

import com.crs.kpmg.service.ProfessorService;
import com.crs.kpmg.service.StudentService;

public class RegistrationClient {

	
	public static void main(String[] args) {
		
		
		StudentService service1 = new StudentService();
		service1.Addprofessor();
		ProfessorService service2 = new ProfessorService();
		service2.Addstudent();
	}
}