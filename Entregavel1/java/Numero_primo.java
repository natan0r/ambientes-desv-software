package entregravel;

import java.util.Scanner;

public class Numero_primo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um número:");
		int numero = input.nextInt();
		int divisores = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisores++;
			}
		}
		
		if(divisores == 2) {
			System.out.println("É primo!");
			
		} else {
			System.out.println("Não é primo!");
		}
		input.close();
	}
}
