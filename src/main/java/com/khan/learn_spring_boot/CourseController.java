package com.khan.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> findAllCourse() {
		var courseList = Arrays.asList(
					new Course(1, "Spring Boot", "Khan"),
					new Course(2, "Spring Framework", "Kabul"),
					new Course(3, "Laravel", "Babul")
				);
		
		return courseList;
	}
}
