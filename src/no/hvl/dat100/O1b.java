package no.hvl.dat100;

import java.util.Scanner;

public class O1b {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i= 1; i<=10; i++) {
		//
		System.out.println("Skriv inn poengsum for student " + i  + " (0-100): ");
		int poengsum = scanner.nextInt();
		
		if(poengsum >= 90 && poengsum <=100) {
			System.out.println("Karakter: A"); 
		}
		 else if(poengsum >= 80 && poengsum <= 89) {
		System.out.println("Karakter: B"); 
		 }
		 else if(poengsum >= 60 && poengsum <= 79) {
			 System.out.println("Karakter : C");
		 }
		 else if(poengsum >= 50 && poengsum <= 59) {
			 System.out.println("Karakter : D");
		 }
		 else if(poengsum >= 40 && poengsum <= 49) {
			 System.out.println("Karakter : E");
		 }
		 else if(poengsum >= 0 && poengsum <= 39) {
			 System.out.println("Karakter : F"); 
				 
		 } else {
			 System.out.println("Poengsum er ikke gyldig for karakter, skriv inn et tall mellom 0-100");
			 
		 }		
	}
		scanner.close();
	}
	
}
