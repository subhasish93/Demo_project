package com.greatlearning.lib.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.lib.model.GreatLearning;

//@Controller
@RestController
public class ExampleController {

	@GetMapping("/info")
	//@ResponseBody
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controller is spring boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Roy");
		return greatLearning;
		
	}
	
	@PostMapping("customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatLearning =new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;
		
	}
}
