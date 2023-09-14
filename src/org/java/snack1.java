package org.java;

import java.util.Scanner;

public class snack1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.print("Inserisci un numero: ");
			num = scan.nextInt();
		} while (num % 2 != 0);
		
		System.out.println(num + " è un numero pari");
		
		scan.close();
	}
}
