package com.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private int empid;

	private String empname;

	private int salary;

}
