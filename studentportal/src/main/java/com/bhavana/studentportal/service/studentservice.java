package com.bhavana.studentportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhavana.studentportal.model.Student;
@Service
public interface studentservice {

	Student savestudent(Student s);
	List<Student> getAllStudents();
	Student getStudent(Integer id);
	void deleteStudent(Integer Id);
	Student updateStudent(Integer Id, Student s);
	
}