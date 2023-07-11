package day2;
import java.util.*;

public class DivisibleBy3or5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int value = sc.nextInt();
		
		if(value%3==0 || value%5==0) {
			System.out.println("Divisible by both");
		}
		else {
			System.out.println("Not Divisible by any of 3 or 5");
		}
	}

}
