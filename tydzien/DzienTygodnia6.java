package tydzien;

import javax.swing.JOptionPane;

public class DzienTygodnia6 {
	
	static String nazwaDniaTygodnia(int nr) {
		switch(nr) {
		case 1: return "poniedziałek";
		case 2: return "wtorek";
		case 3: return "środa";
		case 4: return "czwartek";
		case 5: return "piątek";
		case 6: return "sobota";
		case 7: return "niedziela";
		default: throw new IllegalArgumentException("Numer dnia tygodnia " + nr + " poza zakresem");
		}
	}

	public static void main(String[] args) {
		String numerTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");

		try {
			int numer = Integer.parseInt(numerTxt);		
			String nazwa = nazwaDniaTygodnia(numer);
			JOptionPane.showMessageDialog(null, "Ten dzień to " + nazwa);
		} catch(Exception e) {
			// wyłapujemy wszystkie wyjątki na raz
			
			JOptionPane.showMessageDialog(null, e, "Błąd", JOptionPane.ERROR_MESSAGE);
			// JOptionPane.showMessageDialog(null, e.getMessage(), "Błąd", JOptionPane.ERROR_MESSAGE);
		}
	}
}
