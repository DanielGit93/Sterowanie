package warunki;

import java.util.Scanner;

public class CoMozeKupic1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile masz lat?");
		int wiek = sc.nextInt();
		sc.close();
		
		if(wiek < 5) {
			System.out.println("Kaszka z mleczkiem");
		}
		
		if(wiek >= 5 && wiek < 18) {
			System.out.println("Cukierki i soczek");
		}
		
		if(wiek >= 18 && wiek < 65) {
			System.out.println("Piwo");
		}
		
		if(wiek >= 65) {
			System.out.println("Witaminki");
		}
	}

}
