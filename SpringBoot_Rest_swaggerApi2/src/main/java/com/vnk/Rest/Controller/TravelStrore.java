package com.vnk.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnk.Rest.Entity.Travels;
import com.vnk.Rest.Services.TravelServ;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/travels")
@Tag(name = "Travel",description = "Travel my bus")
public class TravelStrore {
@Autowired
private TravelServ serv;
@GetMapping("/")
public String home(){
	return "Welcome to Travels";
 }
@Operation(summary = "my travel",description = "save travel Api")
@PostMapping("/bookticket")
@ApiResponse(responseCode = "201", description = "Travel Saved",
content = {@Content(mediaType = "application/json",
schema = @Schema(implementation = Travels.class))})
public ResponseEntity<String> bookTicket(@RequestBody Travels travel){
	try {
	return new ResponseEntity<String>(serv.bookTravel(travel),HttpStatus.CREATED);
	}catch (Exception e) {
	return new ResponseEntity<String>("Not booked Your ticket",HttpStatus.INTERNAL_SERVER_ERROR);	
	}
  }

 @GetMapping("/view")
 public ResponseEntity<?> view(){
  List<Travels> list= serv.view(); 
  return new ResponseEntity<List<Travels>>(list,HttpStatus.OK);
 }
 
 @GetMapping("/someDetails")
 public ResponseEntity<String> someDetails(){
  String str= serv.someDetails(); 
  return new ResponseEntity<String>(str,HttpStatus.OK);
 }
 
 @PatchMapping("/modify/{name}/{id}")
 public ResponseEntity<?> modifyDetails(@PathVariable("name")String name,@PathVariable("id")  int id){
	   try {
		String st =serv.updateDetails(name,id);  
	    return new ResponseEntity<String>(st,HttpStatus.OK);
	   }catch (Exception e) {
		  return new ResponseEntity<String>("Not found",HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	}
 @DeleteMapping("/cancel/{id}")
 public ResponseEntity<String> cancel(@PathVariable("id")int id){
	  return new  ResponseEntity<String>( serv.delete(id),HttpStatus.GONE);
 }
}
