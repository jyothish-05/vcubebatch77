package com.arrays;

public class MinandMax {

	public static void main(String[] args) {
		
		int arr[] = {3,5,65,78,99,-2,23};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int a:arr) {
			if(a<min) {
				min = a;
			}else if(a>max) {
				max = a;
			}
		}
		
		System.out.println("minimum number: "+min);
		System.out.println("maximum number: "+max);

	}

}
