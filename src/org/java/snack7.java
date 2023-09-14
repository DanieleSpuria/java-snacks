package org.java;

import java.util.Scanner;

public class snack7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserire secondi: ");
		int seconds = scan.nextInt();
		
		int minutes = seconds / 60;
		int hours = minutes / 60;
		
		seconds %= 60;
        minutes %= 60;
        hours %= 24;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		scan.close();
	}
}
