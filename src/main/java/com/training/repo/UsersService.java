package com.training.repo;

import java.util.List;

import com.training.models.Users;

public interface UsersService {

	public List<Users> listUsers();
	public void addUsers(Users users);
//	public String deleteStudent(Users users);
//	public String updateStudent(Users users);
//	public Users getStudents(Integer idUser);
}
