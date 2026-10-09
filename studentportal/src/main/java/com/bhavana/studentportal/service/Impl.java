package com.bhavana.studentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavana.studentportal.model.Student;
import com.bhavana.studentportal.repo.StudentRepo;
@Service 
public  class Impl implements studentservice{

	@Autowired
	StudentRepo st;
	
	@Override
	public Student savestudent(Student s) {
		return st.save(s);
	}

	

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return st.findAll();
	}

	@Override
	public Student getStudent(Integer id) {
		
		return st.findById(id).get();
	}

	@Override
	public void deleteStudent(Integer Id) {
	st.deleteById(Id);
		
	}

	
	@Override
	public Student updateStudent(Integer Id, Student s) {
		// TODO Auto-generated method stub
		return st.save(s);
	}
	

}
