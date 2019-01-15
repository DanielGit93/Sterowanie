package tydzien;

import javax.swing.JOptionPane;

public class DzienTygodnia5 {
	
	static String nazwaDniaTygodnia(int numer) {
		switch(numer) {
		case 1: return "poniedziałek";
		case 2: return "wtorek";
		case 3: return "środa";
		case 4: return "czwartek";
		case 5: return "piątek";
		case 6: return "sobota";
		case 7: return "niedziela";
		default: return "niepoprawny numer";
		}
	}

	public static void main(String[] args) {
		String numerTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(numerTxt);
		
		String nazwa = nazwaDniaTygodnia(numer);
		
		JOptionPane.showMessageDialog(null, "Ten dzień to " + nazwa);
	}
}
