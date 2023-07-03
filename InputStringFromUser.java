package day1;
import java.util.Scanner;

public class InputStringFromUser {
	
public static void main(String [] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Your Number");
	int num1 = sc.nextInt();
	System.out.println("You have enter this number: " + num1);
	
	System.out.println();
	
	System.out.println("Enter Your Name");
	String name = sc.next();
	System.out.println("You have enter this Name: " + name);	
	}
}
