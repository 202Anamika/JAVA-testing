package day2;
import java.util.*;

public class EvenDivisibleBy3 {
	public static void main (String [] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int value = sc.nextInt();
		
		if(value%2==0 && value%3==0) {
			System.out.println("The number is Even as well as Divisible by 3: " +value);
		}
			else {
				System.out.println("Not Found");
			
		}
	}

}
