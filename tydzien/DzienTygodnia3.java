package tydzien;

import javax.swing.JOptionPane;

public class DzienTygodnia3 {

	public static void main(String[] args) {
		// program pyta o numer dnia tygodnia (liczbę)
		// program wypisuje nazwę dnia tygodnia dla podanego numeru
		// np.:     Ten dzień to środa
		
		String numerTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia");
		int numer = Integer.parseInt(numerTxt);
		
		String nazwa;
		if(numer == 1) {
			nazwa = "poniedziałek";
		} else if(numer == 2) {
			nazwa = "wtorek";
		} else if(numer == 3) {
			nazwa = "środa";
		} else if(numer == 4) {
			nazwa = "czwartek";
		} else if(numer == 5) {
			nazwa = "piątek";
		} else if(numer == 6) {
			nazwa ="sobota";
		} else if(numer == 7) {
			nazwa = "niedziela";
		} else {
			nazwa = "Niepoprawny numer dnia tygodnia";
		}
		
		JOptionPane.showMessageDialog(null, "Ten dzień to " + nazwa);	
	}
}
