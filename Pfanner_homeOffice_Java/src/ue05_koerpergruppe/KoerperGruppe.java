
package ue05_koerpergruppe;

import java.util.List;
import java.util.ArrayList;

public class KoerperGruppe {
    
    ArrayList<Koerper> koerperListe = new ArrayList<>();
    
    public boolean add(Koerper k){
        
        koerperListe.add(k);
        if(k == null){
            return false;
        }
        
        //+Abfrage ob k ein Koerper ist
        
        return true;        
    }
}
