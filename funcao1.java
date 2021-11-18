* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package funcao1;



/**
*
* @author Manager
*/
public class Funcao1 {
public static void formula(double c){
double kelvin = c + 273.15;
double reaumur = c * 1.8;
double rankine = c * 1.8 + 32 + 459.67;
double fahrenheit = c * 1.8 +32;


System.out.println("O resultado é "+kelvin);
System.out.println("O resultado é "+reaumur);
System.out.println("O resultado é "+rankine);
System.out.println("O resultado é "+fahrenheit);
}



/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
formula(10);
}

}