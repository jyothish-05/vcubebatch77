package com.vcubeprojects;

import java.util.Scanner;

public class SODevenPositions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();

		int rev = sum1(n);
		int sum = 0;
		int count = 0;
		int digit = 0;
		System.out.println("the rev of the given number:" + rev);

		while (rev > 0) {
			digit = rev % 10;
			rev = rev / 10;
			count++;
			if (count % 2 == 0) {
				sum = sum + digit;
			}
		}
		System.out.println("the sum of even position numbers: " + sum);
		sc.close();
	}

	static int sum1(int n) {
		int r = 0;

		int rev = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;

		}

		return rev;
	}

}
