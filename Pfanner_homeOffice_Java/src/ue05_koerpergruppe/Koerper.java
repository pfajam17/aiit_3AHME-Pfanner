
package ue05_koerpergruppe;

public abstract class Koerper {
    
    private double dichte;   
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;
    
    public Koerper(double dichte){
       if(dichte < 0){
           throw new IllegalArgumentException("invalid parameter dichte");
       }
       this.dichte = dichte;
    }
    //insert code fügt nur Konstruktor mit {this.dichte = dichte;} ein ohne Überprüfung
    

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    public double masse(){
        return volumen() * dichte;
    }
    
    public abstract double oberflaeche();
    
    public abstract double volumen();
    
}
