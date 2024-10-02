/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TP5;


/**
 *
 * @author David
 */
public class algoritmosCodigos {

    public static void insercion(int[] array, String orden) {
//Ordenamos el array recibido
        for (int i = 1; i < array.length; i++) {
            int valor = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > valor) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = valor;
        }     
        
        
        //Mostramos el array
        System.out.println("Array ordenado con metodo de insercion:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void burbuja(int[] array) {
        int n = array.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    intercambiado = true;

                }
            }

        } while (intercambiado == true);

        System.out.println("Array ordenado con metodo burbuja:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void seleccion(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j;
                }

            }
            int aux = array[minimo];
            array[minimo] = array[i];
            array[i] = aux;
        }
        System.out.println("Array ordenado con metodo selección:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void busquedaSecuencial(int[] array, int numero) {
        int n = array.length;
        boolean seEncontro = false;
        for (int i = 1; i < n - 1; i++) {
            if (array[i] == numero) {
                seEncontro = true;
            }

        }
        if (seEncontro) {
            System.out.print("El número está en la lista");
        } else {
            System.out.print("El número no está en la lista");
        }
    }

}

