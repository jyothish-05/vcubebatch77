package com.vcubeprojects;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		int temp = n;
		int n1 = 0;
		int r = 0;
		int rev = 0;
		int count = 1;
		int sum = 0;
		while (n > 0) {
			n1 = n % 10;
			rev = (rev * 10) + n1;
			n = n / 10;

		}
		while (rev > 0) {
			r = rev % 10;
			sum = (int) (sum + Math.pow(r, count));
			rev = rev / 10;
			count++;
		}
		System.out.println(sum);
		if (sum == temp) {
			System.out.println("the given number is disarium number");
		} else {
			System.out.println("the given number is not a disarium number");
		}
		sc.close();
	}

}
