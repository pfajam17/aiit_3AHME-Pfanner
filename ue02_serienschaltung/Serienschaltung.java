package ue02_serienschaltung;
import java.util.ArrayList;

public class Serienschaltung {
	
	public double strom;
	public double spannung = 0.0;
        ArrayList<Double> widerstandsListe = new ArrayList<>();
	//public double[] widerstandsFeld;
        
	private void updateSpannung() {
		double gesamtwiderstand = 0.0;
		for(double r : widerstandsListe) {
			gesamtwiderstand += r;
		}		
		spannung = gesamtwiderstand * strom;		
	}
	
	public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
                if(widerstandInOhm < 0 || widerstandInOhm > 10E6){
                    throw new InvalidResistorValueException(widerstandInOhm);
                }
                
               /* if(widerstandsListe.isEmpty()){
                    return;
                }*/
               //nicht auskommentiert ist das array widerstandsListe immer leer, k.A. wieso
               
                widerstandsListe.add(widerstandInOhm);
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
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsListe + '}';
    }
	
}
