package day2;
import java.util.Scanner;

public class SwitchCaseSunMonday {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		
		switch(value)
		{
		case 1: System.out.println("Sunday");
		break;
		
		case 2: System.out.println("Monday");
		break;
		
		case 3: System.out.println("Tuesday");
		break;
		
		case 4: System.out.println("Wednesday");
		break;
		
		case 5: System.out.println("Thrusday");
		break;
		
		case 6: System.out.println("Friday");
		break;
		
		case 7 :System.out.println("Saturday");
		
		default: System.out.println("Invaild value ..... Enter between 1-7");
		}
	}

}
