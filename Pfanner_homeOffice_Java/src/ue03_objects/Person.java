
package ue03_objects;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pfajam17
 */
public class Person implements Cloneable {
    private String firstname;
    private final String lastname;

    public Person(String firstname, String lastname) {
        if(firstname == null || firstname.isBlank()){
            throw new IllegalArgumentException("Invalid first name");
        }
        if(lastname == null || lastname.isBlank()){
            throw new IllegalArgumentException("Invalid last name");
        }
        
        this.firstname = firstname;
        this.lastname = lastname;
    }
 
    public String getFirstname() {
        return firstname;
    }
 
    public String getLastame() {
        return lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public Person clone() {
        try {
            //return new Person(firstname, lastname);
            return (Person)super.clone(); 
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
/*
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Person other = (Person)obj;
        if(!Objects.equals(firstname, other.firstname)){
            return false;
        }
        if(!Objects.equals(lastname, other.lastname)){
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
       int hc = firstname.hashCode();
       hc =hc * 59 + lastname.hashCode();
       return hc;
    }
*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.firstname);
        hash = 61 * hash + Objects.hashCode(this.lastname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
     
    
     
}
