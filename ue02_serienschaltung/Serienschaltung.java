package ue02_serienschaltung;

public class Serienschaltung {
	
	public double strom;
	public double spannung;
	public double[] widerstandsFeld;
	
	private void updateSpannung() {
		double gesamtwiderstand = 0.0;
		for(double r : widerstandsFeld) {
			gesamtwiderstand += r;
		}		
		spannung = gesamtwiderstand * strom;		
	}
	
	public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
                if(widerstandInOhm < 0 || widerstandInOhm > 10E6){
                    throw new InvalidResistorValueException(widerstandInOhm);
                }
            
            
		if(widerstandsFeld == null){
                    widerstandsFeld = new double [1];
                    widerstandsFeld[0] = widerstandInOhm;
                }else{
                    double [] feld = new double [widerstandsFeld.length +1];
                    for(int i = 0; i < widerstandsFeld.length; i++){
                        feld[i] = widerstandsFeld[i];
                    }feld[widerstandsFeld.length] = widerstandInOhm;
                    widerstandsFeld = feld;
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
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
	
}
