package entregravel;

import java.util.Scanner;

public class Contagem {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any number:");
		int num1 = input.nextInt();
		int soma = 0;
		
		System.out.println("The sum of the numbers is:");
		for(int i = 1; i <= num1; i++) {
			soma += i;
			System.out.println(soma);
		}
		input.close();
	}
}
