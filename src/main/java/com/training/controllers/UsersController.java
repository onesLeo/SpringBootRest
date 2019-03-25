package com.training.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.training.models.Users;
import com.training.repo.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService userService;
	
	@GetMapping("/users/allusers")
	public ResponseEntity<List<Users>> listStudents(){
		List<Users> listAllUsers = userService.listUsers();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "UserController");
		return ResponseEntity.accepted().headers(headers).body(listAllUsers);
	}
	
	
}
