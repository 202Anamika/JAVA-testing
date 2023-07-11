package day2;

import java.util.Scanner;

public class ifElseifAgeGroup {

	//@SuppressWarnings("resource")
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age= sc.nextInt();
		
		if(age<=12)
		{
		System.out.println("Child");
	}
		else if(age>12 && age<18)
		{
			System.out.println("Teenager");
		}
		else {
			System.out.println("Adult");
		}
}
}
