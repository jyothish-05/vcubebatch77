package com.arrays;

import java.util.Scanner;

public class OnlineShoppingCart {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of products:");
		int n = sc.nextInt();

		double[] price = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("the price of product " + (i + 1) + ":");
			price[i] = sc.nextDouble();
		}

		double total = 0;
		double highest = price[0];
		double lowest = price[0];

		for (int i = 0; i < n; i++) {
			total += price[i];

			if (price[i] > highest) {
				highest = price[i];
				
			}
			if (price[i] < lowest) {
				lowest = price[i];
				
			}

		}
		System.out.println("Total bill = " + total);
		System.out.println("the highest priced product is: " + highest);
		System.out.println("the lowest priced product is: " + lowest);

		System.out.println("Product costing more than Rs 500");

		for (int i = 0; i < n; i++) {
			if (price[i] > 500) {
				System.out.println("product " + (i+1) + ": " + price[i]);
			}
		}
		sc.close();
	}
}