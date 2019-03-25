package com.training.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.models.Users;

@Service
public class UsersServImpl implements UsersService {

	@Autowired
	UsersRepo userRepo;
	
	@Override
	public List<Users> listUsers() {
		List<Users> listAllUsersResult= new ArrayList<>();
		userRepo.findAll().forEach(e -> listAllUsersResult.add(e));
		return listAllUsersResult;
	}

	@Override
	public void addUsers(Users users) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
