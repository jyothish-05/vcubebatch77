package com.vcubeprojects;

public class Account {
	static int accno = 101;
	String cusName;
	String accType;
	String branch;
	int pincode;
	boolean accStatus;


	{
		accno++;
	}

	void show() {
		System.out.println("AccountNO: " + accno);
		System.out.println("Customer Name: " + cusName);
		System.out.println("Account type: " + accType);
		System.out.println("Branch: " + branch);
		System.out.println("Pincode: " + pincode);
		if (accStatus)
			System.out.println("Account is active");
		else
			System.out.println("Account is disactive");
		System.out.println();
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.cusName = "prakash";
		a1.accType = "savings";
		a1.branch = "martur";
		a1.pincode = 523260;
		a1.accStatus = true;

		Account a2 = new Account();
		a2.cusName = "vikram";
		a2.accType = "current";
		a2.branch = "ongole";
		a2.pincode = 522001;
		a2.accStatus = true;

		Account a3 = new Account();
		a3.cusName = "manjula";
		a3.accType = "savings";
		a3.branch = "valaparla";
		a3.pincode = 523320;
		a3.accStatus = false;

		a1.show();
		a2.show();
		a3.show();

	}

}
