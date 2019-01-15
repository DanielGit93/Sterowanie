package tydzien;

import javax.swing.JOptionPane;

public class DzienTygodnia1 {

	public static void main(String[] args) {
		// program pyta o numer dnia tygodnia (liczbę)
		// program wypisuje nazwę dnia tygodnia dla podanego numeru
		// np.:     Ten dzień to środa
		
		String numerTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(numerTxt);
		
		if(numer == 1) {
			JOptionPane.showMessageDialog(null, "Ten dzień to poniedziałek");
		}
		if(numer == 2) {
			JOptionPane.showMessageDialog(null, "Ten dzień to wtorek");
		}
		if(numer == 3) {
			JOptionPane.showMessageDialog(null, "Ten dzień to środa");
		}
		if(numer == 4) {
			JOptionPane.showMessageDialog(null, "Ten dzień to czwartek");
		}
		if(numer == 5) {
			JOptionPane.showMessageDialog(null, "Ten dzień to piątek");
		}
		if(numer == 6) {
			JOptionPane.showMessageDialog(null, "Ten dzień to sobota");
		}
		if(numer == 7) {
			JOptionPane.showMessageDialog(null, "Ten dzień to niedziela");
		}

	}

}





