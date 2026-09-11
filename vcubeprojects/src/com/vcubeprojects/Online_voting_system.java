package com.vcubeprojects;
import java.util.Scanner;
public class Online_voting_system {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("Enter your Gender: ");
			char gender = sc.next().charAt(0);
			if(gender == 'M' || gender == 'F') {
				System.out.println("Enter your voterID: ");
				int voterID = sc.nextInt();
				System.out.println("your voterID is: "+voterID+" please select your candidate ");
				System.out.println("1.CBN");
				System.out.println("2.YS jagan");
				System.out.println("3.KA paul");
				System.out.println("4.PSPK");
				
				int option = sc.nextInt();
				switch(option) {
				case 1 :
					System.out.println("you voted for CBN");
					break;
				case 2 :
					System.out.println("you voted for YS jagan");
					break;
				case 3 :
					System.out.println("you voted for KA paul");
					break;
				case 4 :
					System.out.println("you voted for PSPK");
					break;
				default:
					System.out.println("you voted for NOTA");
				}
			}else {
				System.out.println("not eligible");
			}
		}else {
				System.out.println("not eligible for voting");
			} 
		System.out.println("Thank You for voting");
		sc.close();
		
	
		
		

	}

}
