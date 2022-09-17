package entregravel;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int value = input.nextInt();
		
		int[] vetor = new int[value];
		
		for(int i = 0; i <= value; i++) {
			System.out.println("(" + i + ") >> " + Fibonacci.fibo(i));
		}
		input.close();
	}
	static long fibo(int n) {
		if(n < 2) {
			return n;
			
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
