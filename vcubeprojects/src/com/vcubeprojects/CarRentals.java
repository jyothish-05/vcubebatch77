package com.vcubeprojects;

public class CarRentals {
	
	int days; 
	
	String getCompanyName(String name) {
		name = "Zoom Car Rentals";
		return name;
	}
	int dailyRentalRate(int rate) {
		rate = 1500;
		return rate;
	}
	int rateForDays(int rate) {
		rate = days*rate;
		return rate;
	}
	int insurence(int irate) {
		irate = 500;
		return irate;
	}

	public static void main(String[] args) {
		

	}

}
