
package ue05_koerpergruppe;

public class Koerper {
    private double dichte;
    
    public static double DICHTE_EICHE = 670;
    public static double DICHTE_BUCHE = 690;
    
    public Koerper(double dichte){
       
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    double masse(){
        return volumen() * dichte;
    }
    
    double oberflaeche(){
        return 0.0;
    }
    
    double volumen(){
        return 0.0;
    }
    
}
