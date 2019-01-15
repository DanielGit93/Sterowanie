package petle;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Silnia2 {
	
	static int silniaFor(int n) {
		int wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	static long silniaLong(int n) {
		long wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik *= i;
		}
		return wynik;
	}

	static BigInteger silniaBig(int n) {
		BigInteger wynik = BigInteger.ONE;
		for(int i = 2; i <= n; i++) {
			wynik = wynik.multiply(BigInteger.valueOf(i));
		}
		return wynik;
	}

	static long silniaWhile(int n) {
		long wynik = 1;
		
		while(n > 1) {
			wynik *= n;
			n--;
		}
		return wynik;
	}

	static long silniaRek(int n) {
		// rekurencja / rekursja to jest możliwość wywoływania danej funkcji wewnątrz jej definicji
		// inaczej mówiąc: funkcja wywołuja samą siebie
		
		if(n <= 1) {
			return 1;
		} else {
			return n * silniaRek(n-1);
		}
	}
	
	static long silniaFun(int n) {
		return LongStream.rangeClosed(2, n).reduce(1, (x,y) -> x*y);
	}

	public static void main(String[] args) {
		int wynik;
		
		System.out.println("Wersja for na int-ach:");
		wynik = silniaFor(1);
		System.out.println(wynik);

		wynik = silniaFor(5);
		System.out.println(wynik);

		wynik = silniaFor(10);
		System.out.println(wynik);

		wynik = silniaFor(20);
		System.out.println(wynik);

		wynik = silniaFor(34); // od 34 zaczyna wychodzić 0 na int-ach
		System.out.println(wynik);

		wynik = silniaFor(100);  
		System.out.println(wynik);
		System.out.println();
		
		System.out.println("Wersja for na long-ach:");		
		System.out.println(silniaLong(1));
		System.out.println(silniaLong(5));
		System.out.println(silniaLong(10));
		System.out.println(silniaLong(20));
		System.out.println(silniaLong(100));
		System.out.println();

		System.out.println("Wersja for na BigInteger:");		
		System.out.println(silniaBig(1));
		System.out.println(silniaBig(5));
		System.out.println(silniaBig(10));
		System.out.println(silniaBig(20));
		System.out.println(silniaBig(100));
		System.out.println(silniaBig(1000));
		System.out.println();

		System.out.println("Wersja while na long-ach:");		
		System.out.println(silniaWhile(1));
		System.out.println(silniaWhile(5));
		System.out.println(silniaWhile(10));
		System.out.println(silniaWhile(20));
		System.out.println(silniaWhile(100));
		System.out.println();

		System.out.println("Wersja rekurencyjna:");		
		System.out.println(silniaRek(1));
		System.out.println(silniaRek(5));
		System.out.println(silniaRek(10));
		System.out.println(silniaRek(20));
		System.out.println(silniaRek(100));
		System.out.println();

		System.out.println("Wersja funkcyjna:");		
		System.out.println(silniaFun(1));
		System.out.println(silniaFun(5));
		System.out.println(silniaFun(10));
		System.out.println(silniaFun(20));
		System.out.println(silniaFun(100));
		System.out.println();
	}
}
