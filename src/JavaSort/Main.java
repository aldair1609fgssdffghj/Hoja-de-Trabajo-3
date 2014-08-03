
package JavaSort;

/**
 *
 * @author Kevin
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner _in = new Scanner(System.in);
        
        Sort sort;
        RandomArray newRandom = new RandomArray(10);
        System.out.println("Arreglo desordenado");
        System.out.println(newRandom.toString());
        
        System.out.println("Tipos de ordenamiento:");
        System.out.println(" 1. InsertionSort");
        System.out.println(" 2. Bubble Sort");
        System.out.println(" 3. Merge Sort");
        System.out.println(" 4. Quick Sort");
        
        System.out.println("Ingrese tipo de ordenamiento");
        int opcion = _in.nextInt();
        
        System.out.println("\nArreglo ordenado:");
        int[] _array = newRandom.getArray();
        
        
        SortFactory nfactory = new SortFactory();
        
        sort = nfactory.getSort(_array,opcion);
        
        System.out.println(sort.toString());
    }
    
}
