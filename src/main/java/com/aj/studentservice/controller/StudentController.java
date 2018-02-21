package com.aj.studentservice.controller;

import com.aj.studentservice.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(value = "ping", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> ping() {
		Map<String, String> response = new HashMap<>();
		response.put("message", "pong: 8081");
        return new ResponseEntity<>(response, HttpStatus.OK);
	}

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("P001", "Jane", "Physics"));
        students.add(new Student("C001", "Jim", "Chemistry"));
        students.add(new Student("M001", "John", "Maths"));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
