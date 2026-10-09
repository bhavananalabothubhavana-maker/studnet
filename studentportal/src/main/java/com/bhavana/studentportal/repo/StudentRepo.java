package com.bhavana.studentportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhavana.studentportal.model.Student;
@Repository
//public interface StudentRepo extends JpaRepository<Student,Integer> {
	public interface StudentRepo extends JpaRepository<Student, Integer> {

	}
	


