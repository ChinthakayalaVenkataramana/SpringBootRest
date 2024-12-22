package com.vnk.Rest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnk.Rest.Model.Student;

@RestController
@RequestMapping("/student")
public class StudentOperation {
 @PostMapping("/register")
 public ResponseEntity<String> studentRegister(@RequestBody Student st){
	 return new ResponseEntity<String>(st.toString(),HttpStatus.OK);
 }
}
