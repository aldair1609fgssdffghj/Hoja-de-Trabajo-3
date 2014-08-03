/*
Vidal Villegas   13023
Luis Avila       13077
Kevin Garcia     13177
Kimberly Guzman  13642
 */

package JavaSort;

/**
 *
 * @author Kevin
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        int opcion;
        Scanner _in = new Scanner(System.in);
        Sort sort;
        
        
        System.out.println("Ingresa la cantidad de numeros a generar aleatoriamente");
        opcion  = _in.nextInt();
        RandomArray newRandom = new RandomArray(opcion);
        System.out.println("Arreglo desordenado");
        System.out.println(newRandom.toString());
        
        System.out.println("Tipos de ordenamiento:");
        System.out.println(" 1. InsertionSort");
        System.out.println(" 2. Bubble Sort");
        System.out.println(" 3. Merge Sort");
        System.out.println(" 4. Quick Sort");
        
        System.out.println("Ingrese tipo de ordenamiento");
        opcion = _in.nextInt();
        
        System.out.println("\nArreglo ordenado:");
        int[] _array = newRandom.getArray();
        
        
        SortFactory nfactory = new SortFactory();
        
        sort = nfactory.getSort(_array,opcion);
        
        System.out.println(sort.toString());
    }
    
}
