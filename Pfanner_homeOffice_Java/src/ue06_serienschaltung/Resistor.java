
package ue06_serienschaltung;

public class Resistor extends Component{
    
    public Resistor(double value){
        super("R?", value);
    }
    
    public Resistor(double value, String id){
        super(id, value);
    }

    
    @Override
    public String unit() {
        return "MUSS NOCH ANGELEGT WERDEN";
    }

    @Override
    public double energy() {
        return 0.0;
    }   
    
}
