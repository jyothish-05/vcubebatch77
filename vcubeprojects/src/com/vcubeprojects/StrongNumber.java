package com.vcubeprojects;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;

		int sum = 0;
		while (n > 0) {
			int fact = 1;
			r = n % 10;
			n = n / 10;

			for (int i = 1; i <= r; i++) {
				fact *= i;
			}
			sum = sum + fact;
		}
		if (sum == temp) {
			System.out.println("the given number is strong number");
		} else {
			System.out.println("the given number is not a prime number");
		}
		sc.close();
	}

}
