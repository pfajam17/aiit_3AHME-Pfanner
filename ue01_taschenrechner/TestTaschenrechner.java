package ue01_taschenrechner;
import java.util.Scanner;

public class TestTaschenrechner {

	public static void main(String[] args) {

		Taschenrechner t1 = new Taschenrechner();
		Scanner read = new Scanner(System.in);
		System.out.print("Wert a: ");
		t1.setA(read.nextDouble());
		System.out.print("Wert b: ");
		t1.setB(read.nextDouble());
		read.close();
		
		System.out.println("Addition: " + t1.getAdditionResult());
		System.out.println("Subtraktion: " + t1.getSubtractionResult());
		System.out.println("Multiplikation: " + t1.getMultiplicationResult());
		System.out.println("Division: " + t1.getDivisionResult());
		
		//System.out.println("This Java program was sponsored by Fruchtsaft Pfanner");
	}

}
