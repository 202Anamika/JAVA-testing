package day2;

import java.util.*;

public class OddEvenCon {
	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the number: ");
		 int num=sc.nextInt();
		 
		 String ans;
		 ans=(num%2==0) ? "Even" : "Odd";
		 System.out.println(ans);
		 
	}
	

}
