package com.cragardev.hellohuman;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	
    @RequestMapping("")
    public String hello() {
    	return "Thank you human for NOT sharing your name with us...!";
    }
    
    @RequestMapping("/{name}")
    public String helloName(@PathVariable("name")String name) {
    	return "Thank you " + name + " for sharing your name with us!";
    }
    
    
    @RequestMapping("/{first_name}/{last_name}")
    public String helloFullName(@PathVariable("first_name")String fname, @PathVariable("last_name")String lname) {
    	return "Thank you " + fname + " " + lname + " for sharing your name with us!";
    }
    
    
    @RequestMapping("/times/{input}/{number}")
    public String inputTimesNumber(@PathVariable("input")String input, @PathVariable("number")int num) {
    	String list = "";
    	for (int i = 1; i<=num; i++) {
    		list += input + " ";
    	}
    	return list;
    }
    

}
