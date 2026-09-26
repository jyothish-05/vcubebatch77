package com.vcubeprojects;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int r = 0;
		while (n != 1 && n != 4) {
			int sum = 0;
			while (n > 0) {
				r = n % 10;
				sum += r * r;
				n = n / 10;

			}
			n = sum;

		}
		if (n == 1) {
			System.out.println("the given number is happy number");
		} else {
			System.out.println("the given number is not happy number");
		}
		sc.close();
	}

}
