package com.vcubeprojects;

public class LoanManagement {
	String customerName;
	double loanAmount;
	double intrestRate;
	int Loantenure;

	public static void main(String[] args) {
		LoanManagement p1 = new LoanManagement();
		p1.customerName = "vijay";
		p1.loanAmount = 50000;
		p1.intrestRate = 5;
		p1.Loantenure = 2;
		double intrest1 = p1.calculateIntrest(p1.loanAmount, p1.intrestRate);
		double totalAmount1 = p1.TotalAmount(intrest1);
		double EMI1 = p1.calculateMonthlyEMI(totalAmount1);
		p1.displayLoanSummary(totalAmount1, EMI1, intrest1);
		
		
		
		

	}

	double calculateIntrest(double loanAmount,double intrestRate) {
		double intrest = (loanAmount*intrestRate*Loantenure)/100;
		return intrest;
		
		
	}
	double TotalAmount(double intrest) {
		double totalAmount = loanAmount+intrest;
		return totalAmount;
		
	}
	double calculateMonthlyEMI(double totalAmount) {
		double EMI = (totalAmount)/(Loantenure*12);
		return EMI;
	}
	void displayLoanSummary(double totalAmount,double EMI,double intrest) {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Intrest rate: "+intrestRate);
		System.out.println("Total Intrest: "+intrest);
		System.out.println("Total Loantenure:"+Loantenure+" months");
		System.out.println("Total amount of loan taken: Rs"+loanAmount);
		System.out.println("Monthly EMI you need pay :Rs"+EMI);
		System.out.println("Total loan amount to be paid with intrest: Rs"+totalAmount);
		
		
	}
	


}
