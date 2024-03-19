package com.example.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping("/greetings/{name}")
	 public String hello(@PathVariable String name ) {
		 return "Hello "+name +" welcome to application";
	 }
	
}
