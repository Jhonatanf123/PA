package fatorial;

/**
 *
 * @author franc
 */


public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       for (int i = 1, fatorial = 1; i <= 5; i++) {			
		fatorial *= i;
		System.out.println("fatorial de " + i + " é: " + fatorial);
		
        
    }
    }
    
}