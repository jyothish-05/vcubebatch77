package com.vcubeprojects;

import java.util.Scanner;

class Product{
	String pname;
	double price;
	int quantity;


 public Product(String pname,double price,int quantity){
	 this.pname = pname;
	 this.price = price;
	 this.quantity = quantity;
	 
 }
 
  double calamount() {
	  return price*quantity;
  }
}

public class ShoppingCartBilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double billAmount = 0;
		
		for(int i =1;i<=5;i++) {
			System.out.println("Enter details of product: "+i);
			System.out.println("Product Name: ");
			String pname = sc.nextLine();
			
			System.out.println("Enter the price: ");
			double price = sc.nextDouble();
			
			System.out.println("Enter the quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			Product p = new Product(pname,price,quantity);
			
			double total = p.calamount();
			
			billAmount = billAmount + total;
			
		}
		 double discount = 0;
		 
		if(billAmount>5000) {
			discount = billAmount * 0.10;
		}
		
		double totalbill = billAmount - discount;
		
		System.out.println("Bill Amount of your purchase: "+billAmount);
		System.out.println("special discount offer: "+discount);
		System.out.println("your total bill: "+totalbill);

	}

}
