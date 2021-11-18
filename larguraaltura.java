/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package nomesobrenome;



/**
*
* @author Manager
*/
public class Nomesobrenome {
public static void resultado(double alturaP,double larguraP){
double qtd =(alturaP * larguraP) / (alturaP * larguraP) ;



System.out.println("O resultado é "+qtd);
}
public static void main(String[] args) {
// TODO code application logic here
resultado(40,15);
}

}