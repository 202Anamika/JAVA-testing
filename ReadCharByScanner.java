package day1;
import java.util.Scanner;

public class ReadCharByScanner {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the charater");
	char ch = sc.next().charAt(0);
	System.out.println("Character is: " + ch);
	}
}
