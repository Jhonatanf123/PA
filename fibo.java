package fibonacci;

/**
 *
 * @author franc
 */
public class Fibonacci {

 static long fibo (int n) {
     if (n<2) {
         return n;
     } else {
         return fibo(n-1)+fibo(n-2);
     }
 }
    
    public static void main(String[] args) {
        
        for(int n = 0; n<30;n++) {
            System.out.println("("+n+"):"+
                    Fibonacci.fibo(n));

        }    
        
    }
    
    }
