
package ue05_koerpergruppe;

import java.util.Locale;

public final class Kugel extends Koerper{
   
    private double r;
    
    public Kugel(double r){
        super(Koerper.DICHTE_EICHE);
        setR(r);
    }
    
    public Kugel(double r, double dichte){
        super(dichte);
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double volumen(){
        return 4.0/3.0 * r*r*r * 22.0/7.0;
    }
    
    @Override
    public double oberflaeche(){
        return r*r * 4.0 * 22.0/7.0;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "{\"r\":%e, \"dichte\":%e}", r, getDichte());
    }
    
    
}
