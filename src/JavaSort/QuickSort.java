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
public class QuickSort extends Sort{
    public QuickSort (int[] array){
        _sortedArray = array;
        quick_srt(_sortedArray,0,_sortedArray.length-1);
    }

  public static void quick_srt(int array[],int low, int n){
      int lo = low;
      int hi = n;
      if (lo >= n) {
          return;
      }
      int mid = array[(lo + hi) / 2];
      while (lo < hi) {
          while (lo<hi && array[lo] < mid) {
              lo++;
          }
          while (lo<hi && array[hi] > mid) {
              hi--;
          }
          if (lo < hi) {
              int T = array[lo];
              array[lo] = array[hi];
              array[hi] = T;
          }
      }
      if (hi < lo) {
          int T = hi;
          hi = lo;
          lo = T;
      }
      quick_srt(array, low, lo);
      quick_srt(array, lo == low ? lo+1 : lo, n);
   }
}