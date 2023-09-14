package org.java;

import java.util.Scanner;

public class snack5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean zero = false;
		int letters = 0;
		int numbers = 0;
		int symbols = 0;
		
		while (!zero) {
		
			System.out.print("Inserisci una stringa: ");
			String input = scan.nextLine();
			
			for (int i = 0; i < input.length(); i++) {
				
				char inputChar = input.charAt(i);
				
				if (inputChar == '0') zero = true; 
				if (Character.isLetter(inputChar)) letters++;
				else if (Character.isDigit(inputChar)) numbers++;
				else symbols++;	
			}
			
			System.out.println("lettere: " + letters);
			System.out.println("numeri: " + numbers);
			System.out.println("simboli: " + symbols);
		}
		
		System.out.println("Hai inserito 0");
		
		scan.close();
	}
}
