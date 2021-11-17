package matriz;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int[][]Matriz = new int[3][3];
    System.out.println("Insira o valor para a coordenada [0, 0]");    
    Matriz[0][0] = sc.nextInt();    
    System.out.println("Insira o valor para a coordenada [0, 1]"); 
    Matriz[0][1] = sc.nextInt();
    System.out.println("Insira o valor para a coordenada [0, 2]"); 
    Matriz[0][2] = sc.nextInt();    
    System.out.println("Insira o valor para a coordenada [1, 0]"); 
    Matriz[1][0] = sc.nextInt();   
    System.out.println("Insira o valor para a coordenada [1, 1]"); 
    Matriz[1][1] = sc.nextInt();   
    System.out.println("Insira o valor para a coordenada [1, 2]"); 
    Matriz[1][2] = sc.nextInt();    
    System.out.println("Insira o valor para a coordenada [2, 0]"); 
    Matriz[2][0] = sc.nextInt();    
    System.out.println("Insira o valor para a coordenada [2, 1]"); 
    Matriz[2][1] = sc.nextInt();    
    System.out.println("Insira o valor para a coordenada [2, 2]"); 
    Matriz[2][2] = sc.nextInt();    
    System.out.println("Essa é sua Matriz :");   
    
     for (int linha = 0; linha < Matriz.length;linha++){
     for(int coluna = 0; coluna < Matriz[0].length;coluna++){
     
       System.out.print(Matriz[linha][coluna]+ " ");
     }
     System.out.println(" ");
   }
        
            int soma = Matriz[0][0] + Matriz[0][1] +  Matriz[0][2] + 
                        Matriz[1][0]
                       +  Matriz[1][1] +  Matriz[1][2] +  Matriz[2][0]
                    +  Matriz[2][1] +  Matriz[2][2];
            
            System.out.println("A Soma de todos os elementos é "+soma);
        
    }
    


        
    }