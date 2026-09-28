package com.vcubeprojects;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number: ");
		int n = sc.nextInt();

		int r = 0;
		int temp = n;
		while (temp > 9) {
			int sum = 0;
			while (temp > 0) {
				r = temp % 10;
				temp = temp / 10;
				sum = sum + r;
			}
			temp = sum;
		}

		if (temp == 1) {
			System.out.println("the given number is magic number");
		} else {
			System.out.println("the given number is not a magic number ");
		}

		sc.close();
	}

}
