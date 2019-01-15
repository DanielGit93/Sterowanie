package zgadywanka;

import javax.swing.JOptionPane;

public class Zgadywanka {

	public static void main(String[] args) {
		int x = 7;
		int y = 6;
		
		// Ile to jest 7 * 6?
		// użytkownik podaje liczbę
		// dopóki użytkownik podaje nieprawidłowe wyniki, program pyta dalej
		// jeśli liczba jest poprawna, to program wyświetla "gratulacje" i się kończy
		
		int propozycja = 0;
		
		while(propozycja != 42) {
			String odpowiedz = JOptionPane.showInputDialog("Ile to jest " + x + " * " + y);
			propozycja = Integer.parseInt(odpowiedz);
		}
		
		JOptionPane.showMessageDialog(null, "Gratulacje, podałeś poprawną odpowiedź");
	}

}
