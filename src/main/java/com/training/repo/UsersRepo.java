package com.training.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.models.Users;

@Repository
public interface UsersRepo extends CrudRepository<Users, Integer> {

//	public List<Users> listStudents();
//	public void addStudent(Users users);
//	public String deleteStudent(Users users);
//	public String updateStudent(Users users);
//	public Users getStudents(Integer idUser);

//	public Users findUserById(Integer idUser);
	
	
}
