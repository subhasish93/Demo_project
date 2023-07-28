package com.greatlearning.lib.springbootlib;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.lib.model.GreatLearning;


@SpringBootApplication
public class SpringBootLibApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//GreatLearning greatLearning = new GreatLearning();
		//greatLearning.setCourseName("Test Course");
		//greatLearning.setCourseType("Information Technology");
		//greatLearning.setInstructorName("Roy");
		//greatLearning.setCourseName();
		//System.out.println("Course Name:" + greatLearning );
		
	}

}
