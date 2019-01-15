package warunki;

import java.util.Scanner;

public class CoMozeKupic3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile masz lat?");
		int wiek = sc.nextInt();
		sc.close();
		
		// Jeśli po if albo else znajduje się tylko jedna instrukcja,
		// to można nie pisać klamerek.
		// Jednak wielu programistów pisze klamerki nawet w tekich sytuacjach, aby było mniej wątpliwości w zrozumieniu programu i aby łatwiej było go modyfikować
		if(wiek < 5)
			System.out.println("Kaszka z mleczkiem");
		else if(wiek < 18)
			System.out.println("Cukierki i cola");
		else if(wiek < 65)
			System.out.println("Piwo");
		else				
			System.out.println("Biovital");
	}

}
