package com.ju;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkins.MainClass;

public class RunnerClass {

	@Test
	public void getSalary() {
	MainClass main1 = new MainClass("Jennifer", 1111, 20000);
	int totalSalary = main1.getGrossSalary();
	assertEquals(30000, totalSalary);        	
	}
	
	@Test
	public void getProvidentFund() {
        MainClass main2 = new MainClass("Scarlett", 2222, 10000);
        double totalSalary = main2.getGrossSalary();
        assertEquals(15000, totalSalary, 0);
    }

}
