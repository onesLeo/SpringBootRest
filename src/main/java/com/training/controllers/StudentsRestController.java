package com.training.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.impl.StudentsProses;
import com.training.models.Students;
import com.training.models.StudentsReply;

@RestController
public class StudentsRestController {

	@RequestMapping(method=RequestMethod.GET,value="/retrieve/listAllStudents")
	@ResponseBody
	public List<Students> getAllStudent(){
		
		return StudentsProses.getInstances().getListStudents();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add/addStudent")
	@ResponseBody
	public StudentsReply addStudent(@RequestBody Students student) {
		System.out.println("Registering Student");
		StudentsReply stReply = new StudentsReply();
		StudentsProses.getInstances().addStudents(student);
		stReply.setIdStudent(student.getIdStudent());
		stReply.setStudentName(student.getStudentName());
		stReply.setRegistrationNum(student.getRegistrationNum());
		stReply.setRegistrationStatus("Success");
		return stReply;
		
	}
}
