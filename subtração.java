package subtracao;

import java.util.Scanner;
public class Subtracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
  
  int x,y,z, resultado;
  
  System.out.println("Este programa faz 3 contas de subtração");
  System.out.println("Digite 3 números para a subtração");
  
  x = sc.nextInt();
  y = sc.nextInt();
  z = sc.nextInt();
  
  resultado = x - y - z;
  
  System.out.println("O resultado da subtração foi "+resultado);
        
    }
    
}