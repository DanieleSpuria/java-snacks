package org.java;

import java.util.Arrays;
import java.util.Random;

public class snack10 {

	public static void main(String[] args) {
		
		int[] num   = new int[10];
		Random rnd  = new Random();
		
		int[] even  = new int[10];
		int[] odd   = new int[10];
		int[] iEven = new int[10];
		int[] iOdd  = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100, 1000);
			
			if (num[i] % 2 == 0) even[i] = num[i];
			else odd[i] = num[i];
			
			if (i % 2 == 0) iEven[i] = num[i];
			else iOdd[i] = num[i];
		}
		
		System.out.println("Numeri pari: "    + Arrays.toString(even));
		System.out.println("Numeri dispari: " + Arrays.toString(odd));
		System.out.println("Indice pari: "    + Arrays.toString(iEven));
		System.out.println("Indice dispari: " + Arrays.toString(iOdd));
	}
}
