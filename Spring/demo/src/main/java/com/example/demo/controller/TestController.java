package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/jjj")
public class TestController {

	
	@PostMapping
		public void test(@RequestBody StudentDTO std ) {
			System.out.println("Inside Post Controller!!");
		}
	
	@GetMapping("/{id}")
		public void testGet(@PathVariable("id") String studenid,
				@PathVariable(secondId) String empid,
				@RequestParam("name") String name) {
			System.out.println("Inside Get Controller");
			System.out.println(empid);
			
		}
	@GetMapping("/student")
			public void getAllStudents() {
				System.outprintln("Inside get students");	
				}
	
	@GetMapping("/student/{Id}")
		
}
