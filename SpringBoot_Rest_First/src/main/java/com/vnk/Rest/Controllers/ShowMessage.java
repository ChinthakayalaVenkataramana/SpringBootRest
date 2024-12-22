package com.vnk.Rest.Controllers;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")
public class ShowMessage {
  @GetMapping("/wish")
  public ResponseEntity<String> show(){
	  LocalDateTime l=LocalDateTime.now();
	  String msg=null;
	  int time=l.getHour();
	  if(time<12)
       msg="Good Morning";
	  else if(time<16)
		  msg="Good Ofternoon";
	  else
		  msg="Good Night";
	  
	ResponseEntity<String> entity=new ResponseEntity<>(msg,HttpStatus.OK);
		  
	return entity;	  
  }
}
