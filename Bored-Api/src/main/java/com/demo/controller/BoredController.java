package com.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.BoredServices;

@RestController
public class BoredController {

	@Autowired
	public BoredServices boredServices;

	int c=0;

	@GetMapping("/Bored")
	public ResponseEntity<String> GetBoredTasks()
	{
		Random random = new Random();
		int index = random.nextInt(this.boredServices.activities.size());

		HttpHeaders headers = new HttpHeaders();
		headers.add("Custom-Header", headers.LOCATION + " " + headers.SET_COOKIE);
		headers.add("Custom-Heade1r", "Greeting controller");
		headers.setExpires(5);
		String body = "Welcome Home this is for all ";
		c++;
		System.out.println(c + " times API Called");
		return new ResponseEntity<>(this.boredServices.activities.get(index), headers, HttpStatus.OK);

	}

}
