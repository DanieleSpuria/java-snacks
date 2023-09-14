package org.java;

import java.util.Scanner;

public class snack4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserire una parola: ");
		String input = scan.nextLine();

//		StringBuilder inputRev = new StringBuilder(input);
//		inputRev.reverse();
//		String inputRevStr = inputRev.toString();
//		if (input.equals(inputRevStr)) System.out.println("La parola inserita è un palindromo");
		
		boolean pal = false;
		
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
				pal = true;
			}
		}
		
		if (pal) System.out.println(input + " è una parola palindroma");

		scan.close();
	}
}
