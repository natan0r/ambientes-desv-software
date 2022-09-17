package entregravel;

import java.util.Scanner;

public class Somatório {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1 = input.nextInt();
		System.out.println("Enter one more number:");
		int num2 = input.nextInt();
		
		int calculation = num1 + num2;
		
		System.out.println("The sum of the numbers is: " + calculation);
		
		input.close();
	}
}
