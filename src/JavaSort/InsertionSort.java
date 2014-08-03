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
public class InsertionSort extends Sort {
    public InsertionSort(int[] a){
        for(int i=1;i<a.length; i++){
            int temp = a[i];
            int j;
            for(j =i-1;j>=0 && temp < a[j]; j--)
                a[j+1]=a[j];
            a[j+1]=temp;  
        }
        _sortedArray = a;
    }
}
