package com.vcubeprojects;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Even numbers: ");
		even(n);
		System.out.println();
		System.out.println("odd numbers: ");
		odd(n);
		
		sc.close();

	}
	static void even(int n) {
		for(int i = 1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	static void odd(int n) {
		for(int i = 1;i<=n;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

}
