package petle;

import java.util.Scanner;

public class Silnia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj argument:");
		int n = sc.nextInt();
		System.out.println("Liczę silnię dla " + n);
		
		int wynik = 1;
		for(int i = 1; i <= n; i++) {
			wynik = wynik * i;
		}
		System.out.println(n + "! = " + wynik);
	}
}
