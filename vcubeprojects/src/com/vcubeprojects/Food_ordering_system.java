package com.vcubeprojects;
import java.util.Scanner;

public class Food_ordering_system {
	 static String item;
	 static int price;
	 static int totalbill;

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter your order: ");
		
		
		System.out.println("*****MENU*****");
		System.out.println("1-pizza - rs200");
		System.out.println("2-burger - rs120");
		System.out.println("3-biryani - rs180");
		System.out.println("4-noodles - rs100");
		
		System.out.println("select your choice: ");
		int select = sc.nextInt();
		switch(select) {
		case 1: 
			item = "pizza";
			price = 200;
			
		break;
		case 2:
			item = "burger";
			price = 120;
		break;
		case 3: 
			item = "biryani";
			price = 180;
		break;
		case 4: 
			item = "noodles";
			price = 100;
		break;
		default:
			System.out.println("invalid selection");
		break;	
		
		
		}
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		
		 totalbill = quantity*price;
		 System.out.println("your total bill to be paid: ");
		 System.out.println(totalbill);
		 
		 System.out.println("Thank you,for visiting");
		
		
		

	}


}
