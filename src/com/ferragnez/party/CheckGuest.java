package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] partyGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String guest;
		
		System.out.print("Buonasera! E' un invitato? \nSì, sono ");
		guest = scan.nextLine();
		
		for(int i = 0; i < partyGuests.length; i++){ //scorre i nomi degli invitati
			if(guest.equalsIgnoreCase(partyGuests[i])) {   //compara i nomi tra l'input e l'array
				System.out.println("Prego, " + guest + " entri pure e buona serata!");				
				
				break;
			} else if (i == partyGuests.length-1) {		//quando arriva all'ultima posizione e non ha trovato il nome dell'invitato
				System.out.println("Mi dispiace ma le devo chiedere di andarsene.");
			} 
		}
		
		scan.close();
	}

}
