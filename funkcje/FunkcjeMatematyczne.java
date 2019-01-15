package funkcje;

public class FunkcjeMatematyczne {
	
	public static void main(String[] args) {
		System.out.println(poleKwadratu(5));
		System.out.println(poleKwadratu(57.5));
		System.out.println(poleKola(10));

		System.out.println("pole " + poleProstokata(3, 5));
		System.out.println("obwód " +obwodProstokata(3, 5));
	}
	
	/** Zwraca pole kwadratu o boku długości a. */
	static double poleKwadratu(double a) {
		return a*a;
	}
	
	/** Zwraca pole prostokąta o bokach długości a i b. */
	static double poleProstokata(double a, double b) {
		return a*b;
	}
	
	/** Zwraca obwód prostokąta o bokach długości a i b. */
	static double obwodProstokata(double a, double b) {
		return 2*a + 2*b;
	}

	/** Zwraca pole koła o promieniu r. */
	static double poleKola(double r) {
		return Math.PI * r * r;
	}
}
