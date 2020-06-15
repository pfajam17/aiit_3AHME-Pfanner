
package ue06_serienschaltung;

import java.util.Locale;

public abstract class Component {
    
    protected String id;
    protected double value;
    private double voltage;
    private double current;
    
    public Component(String id, double value){
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setCurrent(double current) {
        this.current = current;
    }
    
    public double power(){
        return voltage*current;
    }    
    
    public String formattedValue(){
        return "MUSS NOCH ANGELEGT WERDEN";
    }
    
    public String formattedValue(Locale locale){
        return "MUSS NOCH ANGELEGT WERDEN";
    }

    @Override
    public String toString() {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }
    
    public abstract String unit();
    
    public abstract double energy();
}
