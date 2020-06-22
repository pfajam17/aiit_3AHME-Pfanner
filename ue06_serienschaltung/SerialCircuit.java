package ue06_serienschaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SerialCircuit {
    
    private List<Component> components = new ArrayList();
    private double current;
    
    public SerialCircuit(Collection<Component> components){
        this.components.addAll(components);        
    }

    public SerialCircuit() {    
        //In der Angabe wird SerialCircuit() ohne Parameter instanziiert, dafür dieser Konstruktor
    }
    
    public boolean add(Component e) {
        
        for(Component c: components){
            if(e.getId() == null || e.getId().equals(c.getId())){
                return false;
            }
        }        
        return components.add(e);
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }
    
    public double totalVoltage(){
        
        double rv = 0.0;
        for(Component c : components){
            rv += c.getVoltage();
        }
        return rv;
    }
    
    public double totalPower(){
        
        double rv = 0.0;
        for(Component c : components){
            rv += c.power();
        }
        return rv;
    }
    public double totalEnergy(){
        
        double rv = 0.0;
        for(Component c : components){
            rv += c.energy();
        }
        return rv;
    }
    
    public Component component(String id){
        return null;
    }
    
    public List<Component> getComponents(){
        return this.components;
    }

    public Component[] toArray() {
        
        Component[] rv = new Component[components.size()];
        for(Component c: components){
            int i = 0;
            rv[i] = c;
            i++;
        }        
        return rv;
    }

    @Override
    public String toString() {
        return components.toString();
    }
    
    
}
