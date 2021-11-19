package com.ferragnez.party;

import java.util.Scanner;

public class Bonus {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] partyGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String guest;
		
		System.out.print("Buonasera! E' un invitato? \nSì, sono ");
		guest = scan.nextLine();
		
		int counter = 0;
		
		while(counter < partyGuests.length) { //finche il numero contatore resta minore della lunghezza dell'array
			
			if(guest.equals(partyGuests[counter])) { //compara l'input utente all'elemento dell'array alla posizione "counter"
				System.out.println("Prego, " + guest + " entri pure e buona serata!");				
				
				break;
				
			} else if (counter == partyGuests.length-1) {
				System.out.println("Mi dispiace ma le devo chiedere di andarsene.");
			} 
			
			counter++;
		}
		
		scan.close();
	}
}	
