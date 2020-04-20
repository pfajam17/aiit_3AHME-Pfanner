package ue02_serienschaltung;

public class Serienschaltung {
	
	public double strom;
	public double spannung;
	public double[] widerstandsFeld;
	
	public void updateSpannung() {
		double gesamtwiderstand = 0;
		for(int i = 0; i < widerstandsFeld.length; i++) {
			gesamtwiderstand = gesamtwiderstand + widerstandsFeld[i];
		}		
		spannung = gesamtwiderstand*strom;		
	}
	
	public void addWiderstand(double widerstandInOhm) {
		for(int i = 0; i < widerstandsFeld.length; i++) {
			/*if(widerstandsFeld[i] = NULL) {
				widerstandsFeld.length ++;
			}*/
			
			widerstandsFeld[i] = widerstandInOhm;
		}
		
		updateSpannung();
	}
	
	public double getStrom() {
		return strom;
	}
	
	public void setStrom(double strom) {
		this.strom = strom;
		updateSpannung();
	}
	
	public double getSpannung() {
		return spannung;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	//kann eclipse auch
	
}
