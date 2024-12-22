package com.vnk.Rest.RestController;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Message")
public class Messege {
	@GetMapping("/msg/{name}/{age}")
	public ResponseEntity<?> msg(@PathVariable String name,@PathVariable int age){
		LocalDateTime td=LocalDateTime.now();
		int hour=td.getHour();
		if(hour<11) {
			return new ResponseEntity<String>("Good Morning   "+name+" "+age,HttpStatus.OK);
		}else if(hour<15) {
			return new ResponseEntity<String>("Good OfterNoon  "+name+" "+age,HttpStatus.OK);
		}else if(hour<20) {
			return new ResponseEntity<String>("Good Morning "+name+" "+age,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Good Evning  "+name+" "+age,HttpStatus.OK);
		}
	}

}
