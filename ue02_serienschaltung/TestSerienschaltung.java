package ue02_serienschaltung;

public class TestSerienschaltung {

	public static void main(String[] args) {
		
	final Serienschaltung serienschaltung = new Serienschaltung();
            try {
                serienschaltung.addWiderstand(30);
            } catch (InvalidResistorValueException ex) {
                System.out.println(ex.getMessage());
                throw new TestFailedException(ex);
            }  
        serienschaltung.setStrom(5);   
        System.out.println(serienschaltung);        
            try {
                serienschaltung.addWiderstand(40);
            } catch (InvalidResistorValueException ex) {
                System.out.println(ex.getMessage());
            }        
        System.out.println(serienschaltung);
        
            try {
                serienschaltung.addWiderstand(-5);
            } catch (InvalidResistorValueException ex) {
                System.out.println(ex.getMessage());
            }
        
        }
        
        public static class TestFailedException extends RuntimeException{
        public TestFailedException(Throwable cause) {
            super(cause);
        }
            
        }

}
 