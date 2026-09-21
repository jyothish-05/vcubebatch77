package vcubeprojects;

import java.util.Scanner;

public class Bank {
	double balance = 25000;
	Scanner sc = new Scanner(System.in);

	void main() {

		System.out.println("Welcome to Bank");

		System.out.println("enter the deposite amount:");
		double amount = sc.nextDouble();
		deposite(amount);

		showBalance();

		System.out.println("enter the withdraw amount: ");
		double amount1 = sc.nextDouble();
		withdraw(amount1);

		showBalance();

	}

	void showBalance() {
		System.out.println("current balance: " + balance);
	}

	void deposite(double amount) {
		balance = balance + amount;

		System.out.println("deposite amount: " + amount);

	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdraw amount: " + amount);
	}

}
