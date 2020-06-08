
package ue05_koerpergruppe;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class KoerperGruppe {
    
    private List<Koerper> koerperListe = new ArrayList<>();
    private double dichte;

    public KoerperGruppe() {
    }
    public KoerperGruppe(Collection<Koerper> koerperListe, double dichte) {
        this.koerperListe.addAll(koerperListe);
        setDichte(dichte);
    }

    public List<Koerper> getKoerperListe() {
        return koerperListe;
    }    

    public int size() {
        return koerperListe.size();
    }

    public boolean contains(Koerper k) {
        return koerperListe.contains(k);
    }  

    public boolean add(Koerper k) {
        return koerperListe.add(k);
    }

    public boolean remove(Koerper k) {
        return koerperListe.remove(k);
    }
    
    public Koerper[] toArray() {
        Koerper[] rv = new Koerper [koerperListe.size()];
        koerperListe.toArray(rv);
        return rv;
    }

    public double getDichte() {
        return dichte;
    }

    public final void setDichte(double dichte) {
        this.dichte = dichte;
        for(Koerper k : this.koerperListe){
            k.setDichte(dichte);
        }
    }
    
    
    public double gesamtmasse(){
        double rv = 0.0;
        for(Koerper k : koerperListe){
            rv += k.masse();
        }
        return rv;
    }
    
    public double gesamtvolumen(){
        double rv = 0.0;
        for(Koerper k : koerperListe){
            rv += k.volumen();
        }
        return rv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("[\n");
        sb.append("Koerpergruppe besteht aus ").append(size()).append(" Koerpern \n");
        
        boolean firstLine = true;
        for(Koerper k : koerperListe){
            if(!firstLine){
                firstLine = false;
            } else {
                sb.append(",\n");
            }
            sb.append("    ").append(k.toString());
        }
        sb.append("\n]");
        
        return sb.toString();
   } 
    
}
