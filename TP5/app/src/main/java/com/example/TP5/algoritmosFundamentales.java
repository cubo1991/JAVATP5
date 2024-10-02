/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TP5;

/**
 *
 * @author David
 */
public class algoritmosFundamentales {

    public static void mostrarExplicaciones() {
        System.out.println("Algoritmos de Ordenación:");
        System.out.println("1. Ordenamiento por Inserción: " +
                "Este algoritmo recorre el array, tomando cada elemento y colocándolo en su posición correcta " +
                "comparándolo con los anteriores ya ordenados, como si ordenaras cartas en la mano.");
        
        System.out.println("2. Algoritmo de la Burbuja: " +
                "Compara elementos adyacentes y los intercambia si están en el orden incorrecto. Los valores pequeños 'flotan' " +
                "hacia el inicio, repitiendo el proceso hasta que toda la lista esté ordenada.");
        
        System.out.println("3. Ordenamiento por Selección: " +
                "Busca el elemento más pequeño en cada iteración y lo coloca al principio de la lista. Luego repite el proceso " +
                "para el resto de la lista.");
        
        System.out.println("4. Algoritmo Quick-Sort: " +
                "Utiliza la técnica de 'divide y vencerás', elige un pivote y coloca los elementos menores a un lado y los mayores al otro. " +
                "Luego aplica el mismo proceso recursivamente a las sublistas.");

        System.out.println("\nAlgoritmos de Búsqueda:");
        System.out.println("1. Búsqueda Secuencial: " +
                "Busca un elemento recorriendo la lista uno por uno, deteniéndose cuando encuentra el valor o llega al final de la lista.");
        
        System.out.println("2. Búsqueda Binaria: " +
                "Busca en listas ordenadas dividiendo el espacio de búsqueda a la mitad, reduciendo el rango hasta encontrar el valor.");

        System.out.println("\nAlgoritmos de Recorrido:");
        System.out.println("1. Recorrido en Profundidad: " +
                "Explora un grafo o árbol empezando desde un nodo y avanzando lo más profundo posible antes de retroceder.");
        
        System.out.println("2. Recorrido en Anchura: " +
                "Explora nivel por nivel, visitando todos los nodos en un nivel antes de pasar al siguiente.");
    }
}

