package com.vcubeprojects;
import java.util.Scanner;

public class Nloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		nNumbers(n);
		sc.close();
	}
	static void nNumbers(int n) {
		for(int i = 1;i<=n;i++) {
			
		}
			if(n%3 == 0 && n%5 == 0) {
				System.out.println("the given number is divisible by 3 ana 5");
			}else {
				System.out.println("the given number is not divisible");
			}
		
	}

}
