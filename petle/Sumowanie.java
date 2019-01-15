package petle;

public class Sumowanie {
	/** Zwraca sumę kolejnych liczb od 1 do n,
	    czyli np. dla n=5 : 1+2+3+4+5 */
	static int sumaKolejnychLiczb(int n) {
		int suma = 0;
		for(int i=1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}
	
	/** Zwraca sumę n kolejnych liczb nieparzystych od 1 do n,
	    czyli np. dla n=5: 1+3+5+7+9 */
	static int sumaNieparzystych(int n) {
		int suma = 0;
		
		for(int i = 1; i <= 2*n; i += 2) {
			suma += i;
		}
		
		return suma;
	}

	static int sumaNieparzystych2(int n) {
		int suma = 0;
		
		for(int i = 1; i <= 2*n; i++) {
			if(i % 2 != 0) {
				suma += i;
			}
		}
		
		return suma;
	}

	static int sumaNieparzystych3(int n) {
		int suma = 0;
		
		for(int i = 1; i <= n; i++) {
			suma += (2*n - 1);
		}
		
		return suma;
	}

	public static void main(String[] args) {
		System.out.println(sumaKolejnychLiczb(1));
		System.out.println(sumaKolejnychLiczb(5));
		System.out.println(sumaKolejnychLiczb(10));
		System.out.println(sumaKolejnychLiczb(100));
		System.out.println();
		System.out.println(sumaNieparzystych(1));
		System.out.println(sumaNieparzystych(5));
		System.out.println(sumaNieparzystych(10));
	}
}
