package day1;

import java.util.Scanner;

//package day1;
public class InputFromUser {
	public static void main(String [] args)

	{
		System.out.println("Enter Your number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("My lucky number is : " + num);
		sc.close();
	}

}
