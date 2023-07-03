package day1;
import java.util.Scanner;
public class SimpleInterst {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal");
		float p = sc.nextFloat();
		System.out.println("The principal that you entered:  " + p);
		
		System.out.println("Enter rate of interest");
		float r = sc.nextFloat();
		System.out.println("The interest that you entered:  " + r);
		
		System.out.println("Enter time");
		float t = sc.nextFloat();
		System.out.println("The time that you entered:  " + t);
		
		float si =(p*r*t)/100;
		
		System.out.println("Simple Interest is:  " +si);
	}
}
