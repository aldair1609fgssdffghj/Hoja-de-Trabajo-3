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

import java.util.Random;

public class RandomArray {
    
    private int[] _array;
    Random random = new Random();
    
    public RandomArray(){
    }
    
    public RandomArray(int[] array){
        _array = array;
    }
    
    public RandomArray(int num){
        _array = new int[num];
        for (int i=0; i<num; i++){
            _array[i]=random.nextInt(2000);
        }
    }
    
    public void setArray(int[] array){
        _array = array;
    }
    
    public int[] getArray(){
        return _array;
    }
    
    public String toString(){
        String temp="";
        
        for (int i=0; i<_array.length; i++){
            temp = temp+_array[i]+"\n";
        }    
        return temp;
    }
}
