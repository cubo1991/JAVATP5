/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaTP4;

import java.util.Scanner;
/**
 *
 * @author alopez
 */
public class Ejercicio4 {
     private static int X = 0;
    private static int[][] matriz;   
   
    static void arrayMenu(){
    Scanner sc = new Scanner(System.in);

        while (X < 4 || X > 10) {
            System.out.println("Por favor, ingrese un valor");
            X = sc.nextInt();
          
        }
        matriz = new int[X][X];
        
        boolean inicializada = matriz != null;
         while(true){
             int opcion = 0;
             System.out.println("Por favor, ingrese una opcion");
             switch(opcion){
                 case 1:
                     System.out.println("Rellene toda la matriz");
         for(int i =0; i < matriz.length; i++){
             for(int j=0; j< matriz[0].length; j++){
               matriz[j][i] = sc.nextInt();
              }
             };
             break;
                 case 2:
                     if (inicializada){
                     // codigo
                     }else{
                     //
                     }
                     break;
                   case 3:
                     if (inicializada){
                     // codigo
                     }else{
                     //
                     }
                     break;
                      case 4:
                     if (inicializada){
                     // codigo
                     }else{
                     //
                     }
                     break;
                      case 5:
                     if (inicializada){
                     // codigo
                     }else{
                     //
                     }
                     break;
                      case 6:
                     if (inicializada){
                     // codigo
                     }else{
                     //
                     }
                     break;
             }
             
     
         } 
        
    }
}
