package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // /courses
    // Course: id, name, author

    @GetMapping("/courses")
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1, "Master Microservices", "Udemy"),
                new Course(2, "Artificial Intelligence", "SNHU"),
                new Course(3, "Math", "Me"),
                new Course(4, "Sample", "None"),
                new Course(5, "Random", "Author")
        );
    }
}
