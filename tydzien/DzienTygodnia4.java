package tydzien;

import javax.swing.JOptionPane;

public class DzienTygodnia4 {

	public static void main(String[] args) {
		String numerTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(numerTxt);
		
		switch(numer) {
		case 1:
			JOptionPane.showMessageDialog(null, "Ten dzień to poniedziałek");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ten dzień to wtorek");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Ten dzień to środa");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Ten dzień to czwartek");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Ten dzień to piątek");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Ten dzień to sobota");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Ten dzień to niedziela");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Niepoprawny numer dnia tygodnia", "Błąd", JOptionPane.ERROR_MESSAGE);
		}
		// papa wypisze soię zawsze
		JOptionPane.showMessageDialog(null, "papa");
	}
}
