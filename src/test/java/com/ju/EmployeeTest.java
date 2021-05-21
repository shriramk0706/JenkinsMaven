package com.ju;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkins.Employee;

public class EmployeeTest {

	@Test
	public void addTest() {
		Employee emp = new Employee();
		assertEquals(15, emp.addNumber(10, 5));	
	}

	@Test
	public void substractTest() {
		Employee emp = new Employee();
		assertEquals(10, emp.substractNumber(20, 10));	
	}
}
