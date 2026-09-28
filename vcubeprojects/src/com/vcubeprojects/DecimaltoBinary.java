package com.vcubeprojects;
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the decimal number: ");
		int n = sc.nextInt();
		
		DtoB(n);
		sc.close();

	}
	static void DtoB(int n) {
		int r = 0;
		String str = "";
		
		while(n>0) {
			r = n%2;
			n = n/2;
			str = r+ str;
			
		}
		System.out.println("the binary number of the given decimal number is: "+str);
	}

}
