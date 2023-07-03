package day1;
import java.util.Scanner;
public class SumOfTwoNum {

	public static void main(String[] args) {
		
		Scanner numm = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = numm.nextInt();
		System.out.println("You have enter: "+ num1);
		
		System.out.println("Enter the Second number");
		int num2 = numm.nextInt();
		System.out.println("You have enter: "+ num2);
		
		int result=num1+num2;
		System.out.println("The Sum of both number is: " + result);
	}
}
