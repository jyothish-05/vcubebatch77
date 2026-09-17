package com.vcubeprojects;
import java.util.Scanner;

public class Findfactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		factor(n);
		sc.close();

	}
	static void factor(int n) {
		for(int i = 1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
