package org.java;

import java.util.Arrays;
import java.util.Random;

public class snack8 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[10];
		int max = 100;
		int min = 150;
		float avg = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100, 150);
			avg += num[i];
			if (num[i] > max) max = num[i];
			if (num[i] < min) min = num[i];
		}
		
		avg /= num.length;
		
		System.out.println("Contenuto array: " + Arrays.toString(num));
		System.out.println("Massimo: " + max);
		System.out.println("Minimo: " + min);
		System.out.println("Media: " + avg);
	}
}
