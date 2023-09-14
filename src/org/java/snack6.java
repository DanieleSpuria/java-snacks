package org.java;

import java.util.Scanner;

public class snack6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String numStr = scan.nextLine();
		
		int num = 0;
		
		for (int i = 0; i < numStr.length(); i++) {
			
			char numChar = numStr.charAt(i);
			int numInt = numChar - '0';
			num = num * 10 + numInt;	// non è mia , l'ho trovata
		}
		
		System.out.println(num);
		
		scan.close();
	}
}
