package com.vcubeprojects;

import java.util.Scanner;

public class BikeRentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of customers: ");
		int n = sc.nextInt();
		int i = 1;
		int fdiscount = 0;
		int daybill = 0;
		while (i <= n) {
			System.out.println();
			System.out.println("Customer " + i + ", how many bikes you need sir ");
			int bike = sc.nextInt();
			

			System.out.println("also tell how many hours you need them: ");
			int hour = sc.nextInt();

			int rate = 50;
			int totalbill = bike * hour * rate;
			daybill += totalbill;

			if (hour >= 5) {
				int discount = 0;
				discount = totalbill / 10;
				fdiscount = fdiscount + discount;
				int finalbill = totalbill - discount;
				System.out.println("customer " + i + " bill: " + totalbill);
				System.out.println("customer " + i + " discountbill: " + finalbill);
			} else {
				System.out.println("customer " + i + " bill: " + totalbill);
			}
			i++;

		}
		System.out.println();
		int dayearnings = daybill - fdiscount;
		System.out.println("Total earnings today: " + dayearnings);

		sc.close();
	}

}
