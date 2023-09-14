package org.java;

import java.util.Scanner;

public class snack9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		while (sum < 1001) {
			
			System.out.print("Inserire un numero: ");
			int num = scan.nextInt();
			sum += num;
		}
		
		System.out.println("Hai superato 1000");
		
		scan.close();
	}
}
