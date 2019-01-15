package funkcje;

public class KonwersjeJednostek {
	private static final double MILE_KM = 1.609344;

	static double mileNaKm(double mile) {
		return mile * MILE_KM;
	}
	
	static double kmNaMile(double km) {
		return km / MILE_KM;
	}
	
	static double c2f(double c) {
		return 32.0 + (9.0 / 5.0) * c;
		// return 32 + 1.8 * c;
	}
	
	static double f2c(double f) {
		return (5.0 / 9.0) * (f - 32.0);
		// return (f - 32) / 1.8;
	}

	public static void main(String[] args) {
		System.out.println(mileNaKm(100));
		System.out.println(mileNaKm(333));

		System.out.println(kmNaMile(100));
		System.out.println(kmNaMile(160));
		System.out.println();
		
		System.out.println("0 F = " + f2c(0) + " C");
		System.out.println("100 F = " + f2c(100) + " C");

		System.out.println("0 C = " + c2f(0) + " F");
		System.out.println("20 C = " + c2f(20) + " F");
		System.out.println("37 C = " + c2f(37) + " F");
		System.out.println("100 C = " + c2f(100) + " F");
	}
}
