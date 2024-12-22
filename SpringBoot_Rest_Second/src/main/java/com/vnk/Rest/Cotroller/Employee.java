package com.vnk.Rest.Cotroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employee {
@GetMapping("/report")
public ResponseEntity<String> custDetails(){
	return new ResponseEntity<String>("Name: VENKY <br> Age : 21 <br> Mobile :9100802854", HttpStatus.OK);
}
@PostMapping("/register")
public ResponseEntity<String> custRegister(){
	return new ResponseEntity<String>("Enter Details <input type='text'>", HttpStatus.OK);
}
@DeleteMapping("/delete")
public ResponseEntity<String> custDelete(){
	return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
}
@PutMapping("/modify")
public ResponseEntity<String> custModify(){
	return new ResponseEntity<String>("You can modify successfully", HttpStatus.OK);
}
@PatchMapping("/pmodify")
public ResponseEntity<String>  updateEmployeeByNo(){
	return new ResponseEntity<String>("Change your modifications",HttpStatus.DESTINATION_LOCKED);
	
}
}
