package com.vcubeprojects;
import java.util.Scanner;

public class ATM {
	
	double balance;
	
	static  String bankName = "SBI";
	
	int acNo;
	Scanner sc = new Scanner(System.in);

	

	public static void main(String[] args) {
		ATM bank = new ATM();
		bank.start();
		
	}
	void start() {
		System.out.println("welcome to "+bankName+" Bank");
		checkBalance();
		
		System.out.println("Enter deposite amount: ");
		double deposite = sc.nextDouble();
		deposite(deposite);
		checkBalance();
		
		System.out.println("Enter withdraw amount: ");
		double withd = sc.nextInt();
		withdraw(withd);
		checkBalance();
		
	}
	
	void deposite(double amount) {
		balance+=amount;
		
	}
	void withdraw(double amount) {
		balance-=amount;
	}
	void checkBalance() {
		System.out.println("total balance: "+balance);
	}

}
