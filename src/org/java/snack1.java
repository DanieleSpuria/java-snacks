package org.java;

import java.util.Scanner;

public class snack1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) System.out.println(num);
		else System.out.println(num + 1);
		
		scan.close();
	}
}
