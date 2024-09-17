package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// leser inn bruttoinntekt		
		System.out.println("Skriv inn inntekt: ");
		
		float bruttoinntekt = scanner.nextInt();
		
		
		if(bruttoinntekt <= 208050  && bruttoinntekt >= 0) {
			System.out.println("Ingen trinnskatt");
		}
		// Trinn 1:
	
		else if(bruttoinntekt <= 292850 && bruttoinntekt >= 208051) {
			System.out.println("Nettoinntekten etter 1.7% trinnskatt er : " + bruttoinntekt * 0.983 + "kr");
		}
		//Trinn 2:
		else if(bruttoinntekt <= 670000  && bruttoinntekt >= 292851) {
			System.out.println("Nettoinntekten etter 4.0% trinnskatt er : " + bruttoinntekt * 0.96 + "Kr");
		}
		//Trinn 3:
		else if(bruttoinntekt <= 937900 && bruttoinntekt >= 670001) {
			System.out.println("Nettoinntekten etter 13.6% trinnskatt er : " + bruttoinntekt * 0.864 + "Kr");
		}
		//Trinn 4:
		else if(bruttoinntekt <= 1350000 && bruttoinntekt >= 937901) {
			System.out.println("Nettoinntekten etter 16.6% trinnskatt er : " + bruttoinntekt * 0.834 + "Kr");
		}
		//Trinn 5:
		else if(bruttoinntekt >= 1350001)
			System.out.println("Nettoinntekten etter 17.6% trinnskatt er : " + bruttoinntekt * 0.824 + "Kr");
		scanner.close();
	}


}
