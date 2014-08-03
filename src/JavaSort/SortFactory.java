/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
