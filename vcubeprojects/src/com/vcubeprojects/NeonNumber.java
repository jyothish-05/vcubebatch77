package com.vcubeprojects;
import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		
		int original = n;
		int square = n*n;
		int sum = 0;
		while(square>0) {
			
			int r = square%10;
			 sum += r;
			 square = square/10;
		}
		if(original == sum) {
			System.out.println("the given number is neon number");
		}else {
			System.out.println("the given number is not a neon number");
		}

	}

}
