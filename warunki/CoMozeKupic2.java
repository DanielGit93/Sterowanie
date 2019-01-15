package warunki;

import java.util.Scanner;

public class CoMozeKupic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile masz lat?");
		int wiek = sc.nextInt();
		sc.close();
		
		if(wiek < 5) {
			System.out.println("Kaszka z mleczkiem");
		} else if(wiek < 18) {
			System.out.println("Cukierki i cola");
			System.out.println("coli nie pij za dużo");
		} else if(wiek < 65) {
			System.out.println("Piwo");
		} else {				
			System.out.println("Biovital");
		}
	}

}
