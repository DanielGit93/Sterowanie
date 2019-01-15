package automat;

import java.util.Scanner;

public class Automat1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// program pyta o kolejne "monety", które wrzuca człowiek i liczy ile wynosi suma
		// można wrzucić najwyżej 3 monety, ale program zakończy się po osiągnięciu wartości 10
		
		int suma = 0;
		
		if(suma < 10) {
			System.out.println("Wrzuć monetę...");
			int moneta = sc.nextInt();
			suma = suma + moneta;
			System.out.println("Wrzucono " + moneta + ", suma wynosi " + suma);
		}
		
		if(suma < 10) {
			System.out.println("Wrzuć kolejną monetę...");
			int moneta = sc.nextInt();
			suma = suma + moneta;
			System.out.println("Wrzucono " + moneta + ", suma wynosi " + suma);
		}

		if(suma < 10) {
			System.out.println("Wrzuć kolejną monetę...");
			int moneta = sc.nextInt();
			suma = suma + moneta;
			System.out.println("Wrzucono " + moneta + ", suma wynosi " + suma);
		}

		System.out.println("Suma wynosi: " + suma);

	}

}
