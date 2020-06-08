
package ue05_koerpergruppe;

import java.util.Locale;

public final class Quader extends Koerper{
    
    double a;
    double b;
    double h;

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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
     public Quader(double a, double b, double h){
        super(Koerper.DICHTE_EICHE);
        if(a<=0){
            throw new IllegalArgumentException("parameter a invalid");
        }
        if(b<=0){
            throw new IllegalArgumentException("parameter b invalid");
        }
        if(h<=0){
            throw new IllegalArgumentException("parameter h invalid");
        }
        setA(a);
        setB(b);
        setH(h);
    }
     
    public Quader(double a, double b, double h, double dichte){
        super(dichte);
        setA(a);
        setB(b);
        setH(h);
    }
    
    @Override
     public double oberflaeche(){
         return a*b*2.0 + a*h*2.0 + b*h*2.0;
     }
     
    @Override
     public double volumen(){
         return a*b*h;
     }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "{\"a\":%e, \"b\":%e, \"h\":%e, \"dichte\":%e}", a, b, h, getDichte());
    }
     
}
