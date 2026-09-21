package com.vcubeprojects;
import java.util.Scanner;

public class Todolist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("time: ");
		float time = sc.nextFloat();
		
		if(time>=5 && time<6 ) {
			System.out.println("Good Morning");
		}else if(time>=6 && time<8) {
			System.out.println("thini institue ki vellu");
		}else if(time>=8 && time<12) {
			System.out.println("focus chei");
		}else if(time>=12 && time<13) {
			System.out.println("akali ga undha");
		}else if(time>=13 && time<14) {
			System.out.println("lunch");
		}else if(time>=14 && time<17) {
			System.out.println("java practice");
		}else if(time>=17 && time<18) {
			System.out.println("it's break");
		}else if(time>=18 && time<20) {
			System.out.println("soft skills practice");
		}else if(time>=20 && time<22) {
			System.out.println("inka paduko");
		}
		sc.close();
	}

}
