package ue01_taschenrechner;

public class Taschenrechner {
	
	private double a;
	private double b;	
	
	public Taschenrechner() {
		
	}
	//kein eigener Konstruktor, weil Werte nicht beim Instanziieren angegeben werden

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	//getter und setter zum Angeben

	public double getAdditionResult() {
		return a+b;
	}
	
	public double getSubtractionResult() {
		return a-b;
	}
	
	public double getMultiplicationResult() {
		return a*b;		
	}
	
	public double getDivisionResult() {
		return a/b;
	}
}
