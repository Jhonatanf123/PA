package impar;

import java.util.Scanner;
public class Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner sc = new Scanner(System.in);
   
   int numero;
   
   System.out.println("Digite um número que irá te mostrar todos");
   System.out.println("ímpares até o número digitado");
    
    numero = sc.nextInt();
    
   for(int i =1; i<=numero; i++){ 
   if(i % 2 == 1 ){
     System.out.println(+i);
     }
  }
        
        
    }
    
}