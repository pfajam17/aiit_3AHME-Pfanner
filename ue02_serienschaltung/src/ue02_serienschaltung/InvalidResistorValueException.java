
package ue02_serienschaltung;

public class InvalidResistorValueException extends Exception{
    public InvalidResistorValueException(double invalidValue){
        super("Nicht verarbeitbarer Widerstandswert " + invalidValue + " Ohm");
    }
}
    