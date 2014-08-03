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
public class SortFactory {

    public Sort getSort(int[] array, int opcion){
        if (opcion == 1)
            return new InsertionSort(array);
        else if (opcion == 2)
            return new BubbleSort(array);
        else if (opcion == 3)
            return new MergeSort(array);
        else
            return new QuickSort(array);
    }
}
