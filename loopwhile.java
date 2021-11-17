package loopwhile;

import java.util.Scanner;

/**
 *
 * @author Manager
 */
public class Loopwhile {

    /**
     * @param args the command line arguments
     */
    
        
    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        
        
        
        int tabuada =1;
        int i = 0;
        int d = 2;
        int t = 3;
        int q = 4;
        int c = 5;
        int s = 6;
        int se = 7;
        int o = 8;
        int n = 9;
        int de = 10;
        int opção;
                
                
        System.out.println("Escolha a tabuada de 1 a 10");
        opção = sc.nextInt();
        if(opção == 1)
            
        while(i<=10) {
        System.out.println(tabuada + "x" + i + "=" + i * tabuada);
        i++;
        }   
        
        else if(opção == 2)
            
        while(i<=10) {
        System.out.println(i + "x" + d + "=" + d * i);
        i++;
        }
        
         else if(opção == 3)
            
        while(i<=10) {
        System.out.println(i + "x" + t + "=" + t * i);
        i++;
        }
        
         else if(opção == 4)
            
        while(i<=10) {
        System.out.println(i + "x" + q + "=" + q * i);
        i++;
        }
        
         else if(opção == 5)
            
        while(i<=10) {
        System.out.println(i + "x" + c + "=" + c * i);
        i++;
        }
        
         else if(opção == 6)
            
        while(i<=10) {
        System.out.println(i + "x" + s + "=" + s * i);
        i++;
        }
        
         else if(opção == 7)
            
        while(i<=10) {
        System.out.println(i + "x" + se + "=" + se * i);
        i++;
        }
       
         else if(opção == 8)
            
        while(i<=10) {
        System.out.println(i + "x" + o + "=" + o * i);
        i++;
        }
        
         else if(opção == 9)
            
        while(i<=10) {
        System.out.println(i + "x" + n + "=" + n * i);
        i++;
        }
        
         else if(opção == 10)
            
        while(i<=10) {
        System.out.println(i + "x" + de + "=" + de * i);
        i++;
        }
        
    }
    
}