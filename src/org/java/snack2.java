package org.java;

public class snack2 {

	public static void main(String[] args) {
			
		String[] names = {
				"Filippo", "Giovanni", "Gertrude", "Gianna"
		};
		
		String[] lastnames = {
				"Conservato", "Allaltezza", "Secondo", "Mulo"
		};
		
		String[] invitati = new String[10];
		
		for (int i = 0; i < names.length; i++) {
			
			invitati[i] = names[i] + " " + lastnames[i];
			System.out.println(invitati[i]);
		}
		
	}
}
