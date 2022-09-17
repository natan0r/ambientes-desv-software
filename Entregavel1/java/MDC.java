package entregravel;

import java.util.Scanner;

public class MDC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a numbers:");
		int num1 = input.nextInt();
		System.out.println("Enter any other number:");
		int num2 = input.nextInt();
		
		int resto;
		while(num2 != 0) {
			resto = num1 % num2;
			num1 = num2;
			num2 = resto;
			System.out.println("MDC = " + num1);
		}
		input.close();
	}
}
