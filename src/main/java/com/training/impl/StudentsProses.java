package com.training.impl;

import java.util.ArrayList;
import java.util.List;

import com.training.models.Students;

public class StudentsProses {

	private List<Students> listStudents;
	private static StudentsProses INSTANCE =null;
	
	
	private StudentsProses() {
		listStudents = new ArrayList<>();
	}
	
	public static StudentsProses getInstances() {
		if(INSTANCE == null) {
			INSTANCE = new StudentsProses();
			return INSTANCE;
		}else {
			return INSTANCE;
		}
		
	}
		
	public void addStudents(Students student) {
		listStudents.add(student);
	}
	
	public void deleteStudent(Students student) {
		for(Students st:listStudents) {
			if(st.getIdStudent()==student.getIdStudent()) {
				listStudents.remove(st);
			}
		}
	}
	
	public List<Students> getListStudents(){
		return listStudents;
	}
}
