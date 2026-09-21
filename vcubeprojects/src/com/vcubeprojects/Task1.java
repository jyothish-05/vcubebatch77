package com.vcubeprojects;

public class Task1 {
	void addition( int a,int b) {
	
	 System.out.println(a+b);
	 
	}
	
	void subtraction(int a,int b) {
		a=30;
		b=12;
		System.out.println(a-b);
	}
	void multiplication(int a,int b) {
		a=3;
		b=5;
		System.out.println(a*b);
		
	}
	void division(int a,int b) {
		a= 66;
		b=11;
		System.out.println(a/b);
	}
	void display() {
		addition(10,30);
		subtraction(30,12);
		multiplication(3,5);
		division(66,11);
	}

	 void main(String[] args) {
		display();

	}

}
