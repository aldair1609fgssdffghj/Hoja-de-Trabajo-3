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
public class BubbleSort extends Sort{
    public BubbleSort (int[] a){        
        int temp;
        
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        _sortedArray = a;
        
    }
}
