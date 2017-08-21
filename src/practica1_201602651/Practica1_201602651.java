/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201602651;

import java.util.Scanner;

/**/
public class Practica1_201602651 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Menú Principal*/
        Scanner s = new Scanner(System.in);
        boolean salir = false; 
        int iniciar;
 /** while(!salir){}*/
      
      System.out.println("Ian Xavier Hernández Dimatteo");
      System.out.println("201602651");
      System.out.println("IPC1 A Práctica 1");
      System.out.println("¡BUSCAMINAS!");
      System.out.println("ingrese un número");
             iniciar = s.nextInt();
             
      switch(iniciar){
          /**Menú al presionar enter*/
          case 1:
          
                System.out.println("Buscaminas");
                System.out.println("1.intermedio");
                System.out.println("2.Avanzado");
                System.out.println("3.Experto");
                System.out.println("4.Salir");
                System.out.println("ingrese un número");
                /**espacio guardar los arreglos de matrices*/
            int    comenzar;
            Scanner com= new Scanner(System.in);
             comenzar = com.nextInt();
             switch(comenzar){
                 case 1:
                     System.out.println("juego intermedio");
                     break;
                 case 2:
                     System.out.println("2.Juego avanzado");
                     break;
                 case 3:
                     System.out.println("2.Juego experto");
                     break;
             }
      
   
              break;
     
      
  }
    }


    
}
