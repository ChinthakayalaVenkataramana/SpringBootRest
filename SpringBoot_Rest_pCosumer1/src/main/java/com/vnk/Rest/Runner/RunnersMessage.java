package com.vnk.Rest.Runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class RunnersMessage implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		 RestTemplate rs=new RestTemplate();
		 String url="http://localhost:3040/Message-api/Message/msg/{name}/{age}";
		 ResponseEntity<String> res=rs.exchange(url, HttpMethod.GET,null ,String.class,"Venky1",21);
		 System.out.println(res.getBody());
		 System.out.println(res.getStatusCodeValue()+"    "+res.getHeaders()+" "+res.getStatusCode());
	}

}
