package com.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Employee;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/v1")

public class EmployeeController {

	private List<Employee> list = new ArrayList<>();

	@PostConstruct
	public void init() {
		System.out.println("init");
		list.add(new Employee(101, "venkat", 300000));
		list.add(new Employee(102, "krishna", 300000));
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

		list.add(employee);
		return ResponseEntity.ok().body(employee);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getEmployees() {

		return ResponseEntity.ok(list);
	}

	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployee(@RequestParam("empid") int empid) {

		return ResponseEntity.ok(list.get(empid));
	}

}
