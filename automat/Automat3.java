package automat;

import java.util.Scanner;

public class Automat3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kwota = 13;  // kwota, którą automat ma zebrać / człowiek ma zapłacić		
		int suma = 0;
		
		System.out.println("Do zapłaty: " + kwota);
		
		while(suma < kwota) {
			System.out.println("Wrzuć monetę...");
			int moneta = sc.nextInt();
			suma = suma + moneta;
			System.out.println("Wrzucono " + moneta + ", suma wynosi " + suma);
		}

		System.out.println("Kwota zebrana, wrzucono: " + suma + " zł");
		
		int reszta = suma - kwota;
		System.out.println("Oddaję " + reszta + " zł reszty");
	}
}
