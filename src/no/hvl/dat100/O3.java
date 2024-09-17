package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn et heltall n > 0");
		 int n = scanner.nextInt();
		 
		 if (n > 0) {
			 long fakultet = beregnFakultet(n);
			 System.out.println(n + "! = " + fakultet);
		 } else {
			 System.out.println("Tallet må være større enn 0.");
		 }
		 
		 
		
		
scanner.close();
	}

	public static long beregnFakultet(int n) {
		long resultat = 1;
		for(int i = 1; i <= n; i++) {
			resultat *= i;
			
		}
		return resultat;
	}
}
