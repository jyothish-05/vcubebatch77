package com.vcubeprojects;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;

		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
