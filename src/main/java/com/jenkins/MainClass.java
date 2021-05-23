package com.jenkins;

public class MainClass {
	private String userName;
    private int userId;
    private int basicSalary;

    public MainClass(String name, int id, int sal) {
        this.userName = name;
        this.userId = id;
        this.basicSalary = sal;
    }

    public int getPf() {
        int pf = basicSalary/2;
        return pf;
    }

    public int getGrossSalary() {
        int grossSalary = getPf()+basicSalary;
        return grossSalary;
    }

    public int getMedical() {
        int medical = basicSalary/5;
        return medical;
    }

}
