package day2;
 import java.util.*;
public class OddEven {
	
public static void main(String [] args) {
	Scanner oe=new  Scanner(System.in);
	
	System.out.println("Enter you number ");
	int num=oe.nextInt();
	
	if(num%2==0) {
		System.out.println("Number is Even");
	}
		else {
			System.out.println("Number is Odd");
		}
	}
}
	
