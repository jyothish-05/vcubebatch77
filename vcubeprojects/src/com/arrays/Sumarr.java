package com.arrays;

public class Sumarr {

	public static void main(String[] args) {
		
		int arr[]  = {3,4,5,2,6,4,3};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			
			sum+=arr[i];
			
		}
		System.out.println("Sum of the given numbers: "+sum);
		

	}

}
