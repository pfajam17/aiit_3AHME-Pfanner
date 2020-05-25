
package ue05_koerpergruppe;

public final class Wuerfel extends Koerper {
    
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
        
    public Wuerfel(double a){
        super(Koerper.DICHTE_EICHE);
        setA(a);
    }
    
    public Wuerfel(double a, double dichte){
        super(dichte);
        setA(a);
    }
    
    @Override
    public double oberflaeche(){
        return a*a*6.0;
    }
    
    @Override
    public double volumen(){
        return a*a*a;
    }
}
