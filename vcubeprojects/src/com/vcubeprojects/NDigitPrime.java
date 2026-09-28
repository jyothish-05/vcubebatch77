package com.vcubeprojects;
import java.util.Scanner;

public class NDigitPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		int n1 = n;
		int r = 0;
		
		System.out.println("Single digit prime numbers: ");
		while (n1 > 0) {
			 r = n1 % 10;
			n1 = n1 / 10;	
			if (isPrime(r)) {
				System.out.print( r+" ");
		}
		}
			n1 = n;
		
		System.out.println();
		System.out.println("double digit prime numbers: ");
		while (n1 > 0) {
			 r = n1 % 100;
			n1 = n1 / 10;
			if (isPrime(r)) {
				System.out.print( r+" ");

			}
		}
		System.out.println();
		n1 = n;
		System.out.println("three digit prime number: ");
		while (n1 > 0) {
			 r = n1 % 1000;
			n1 = n1 / 10;
			if (isPrime(r)) {
				System.out.print( r+" ");

			}
		}
		System.out.println();
		n1 = n;
		System.out.println("four digit prime number");
		while (n1 > 0) {
			 r = n1 % 10000;
			n1 = n1 / 10;
			if (isPrime(r)) {
				System.out.print( r+" ");

			}
		}
			
			}
		
	

	
	static boolean isPrime(int n) {
		boolean status = true;
		if(n<2) {
			return false;
		}
		for(int i = 2;i <= n/2;i++) {
			if(n%i==0) {
				status =  false;
				break;
				
			}
		}
		return status;
	}

}
