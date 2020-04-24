package ue02_serienschaltung;
import java.util.Scanner;

public class TestSerienschaltung {

	public static void main(String[] args) {
		
		Serienschaltung serienschaltung = new Serienschaltung();

		
		do {
			Scanner read = new Scanner(System.in);
			int nummer = 1;
			serienschaltung.addWiderstand(50);
			serienschaltung.addWiderstand(30);
			serienschaltung.addWiderstand(10);
			
			System.out.print(nummer + ": Serienschaltung{Strom = ");
			serienschaltung.setStrom(read.nextDouble());
			System.out.print("  Spannung = " + serienschaltung.spannung);
			read.close();
			nummer++;
		}while(true);
	}

}
 