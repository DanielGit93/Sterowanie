package zgadywanka;

import java.util.Random;

import javax.swing.JOptionPane;

public class Zgadywanka2 {

	public static void main(String[] args) {
		Random random = new Random();
		// wylosowanie liczby od 0 do 9
		int x = random.nextInt(10);
		int y = random.nextInt(10);
		int iloczyn = x * y;
		
		int propozycja = -1;
		
		while(propozycja != iloczyn) {
			String odpowiedz = JOptionPane.showInputDialog("Ile to jest " + x + " * " + y);
			propozycja = Integer.parseInt(odpowiedz);
		}
		
		JOptionPane.showMessageDialog(null, "Gratulacje, podałeś poprawną odpowiedź");
	}

}
