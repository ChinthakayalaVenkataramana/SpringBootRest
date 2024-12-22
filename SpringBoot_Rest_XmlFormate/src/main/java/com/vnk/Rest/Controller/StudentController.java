package com.vnk.Rest.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnk.Rest.Model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
@GetMapping("/report")
public ResponseEntity<Student> postMethodName() {   
	Student st=new Student("Mani",32,"Sri vaishnavi Degree college",21);
    return new ResponseEntity<Student>(st,HttpStatus.OK) ;
}

}
