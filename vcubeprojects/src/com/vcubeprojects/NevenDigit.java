package com.vcubeprojects;

import java.util.Scanner;

public class NevenDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		int r = 0;
		while (n > 0) {
			r = n % 10;
			if (r % 2 == 0) {

				System.out.print(r + " ");
			}
			n = n / 10;
		}
		sc.close();
	}

}
