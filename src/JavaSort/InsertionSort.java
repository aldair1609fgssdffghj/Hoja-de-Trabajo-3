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
public class InsertionSort extends Sort {
    public InsertionSort(int[] a){
        for(int i=1;i<a.length; i++){
            int temp = a[i];
            int j;
            for(j =i-1;j>=0 && temp < a[j]; j--)
                a[j+1]=a[j];
            a[j+1]=temp;
           
        }
    }
}
