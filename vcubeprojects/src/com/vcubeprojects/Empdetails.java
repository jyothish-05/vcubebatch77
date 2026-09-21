package com.vcubeprojects;

public class Empdetails {
	String employeeName;
	double salary;
	String CompanyName;
	
	
	Empdetails(String employeeName,double salary,String CompanyName){
		this.employeeName = employeeName;
		this.salary = salary;
		this.CompanyName = CompanyName;
		
	}

	public static void main(String[] args) {
		Empdetails e1 = new Empdetails("JPR",50000,"HCL");
		Empdetails e2 = new Empdetails("JC",50000,"TCS");
		Empdetails e3 = new Empdetails("SJ",50000,"HT");
		
		e1.display();
		e2.display();
		e3.display();

	}
	void display() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("salary :"+salary);
		System.out.println("Company Name: "+CompanyName);
		System.out.println();
	}

}
