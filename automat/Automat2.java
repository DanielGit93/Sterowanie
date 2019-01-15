package automat;

import java.util.Scanner;

public class Automat2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
		while(suma < 10) {
			System.out.println("Wrzuć monetę...");
			int moneta = sc.nextInt();
			suma = suma + moneta;
			System.out.println("Wrzucono " + moneta + ", suma wynosi " + suma);
		}

		System.out.println("Kwota zebrana, wrzucono: " + suma);

	}

}
