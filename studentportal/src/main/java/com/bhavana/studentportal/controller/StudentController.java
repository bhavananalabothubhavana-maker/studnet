package com.bhavana.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavana.studentportal.model.Student;
import com.bhavana.studentportal.service.studentservice;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
//http://localhost://9898/student
@RequestMapping("/student")
public class StudentController {

    @Autowired
    studentservice stu;
  //http://localhost://9898/student/createstudent
    @PostMapping("/createstudent")
    Student insertStudent(@RequestBody Student s) {
        return stu.savestudent(s);
    }
  //http://localhost://9898/student/getAllstudents
    @GetMapping("/getAllstudents")
    List<Student> getAllStudents() {
    	System.out.println("hsjnefvuhv67wr7834o------------------===");
        return stu.getAllStudents();
    }
  //http://localhost://9898/student/getStudent/{sid}
    @GetMapping("/getStudent/{sid}")
    Student getStudent(@PathVariable Integer sid) {
        return stu.getStudent(sid);
    }
  //http://localhost://9898/student/deletedStudent/{sid}
    @DeleteMapping("/deletedStudent/{sid}")
    String deleteStudent(@PathVariable Integer sid) {
        stu.deleteStudent(sid);
        return "deleted successfully";
    }
  //http://localhost://9898/student/updateStudent/{sid}
    @PutMapping("updateStudent/{sid}")
    Student updateStudent (@PathVariable Integer sid,@RequestBody Student s) {
    	Student  StudentFromDB = getStudent(sid);
    	StudentFromDB.setAge(s.getAge());
    	StudentFromDB.setCity(s.getCity());
    	StudentFromDB.setFirstname(s.getFirstname());
    	StudentFromDB.setLastname(s.getLastname());
    	StudentFromDB.setTotalmarks(s.getTotalmarks());
        return stu.savestudent(StudentFromDB);
    }
}