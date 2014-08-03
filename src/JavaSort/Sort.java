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
public class Sort {
    
    protected int[] _sortedArray;
    
    public int[] getArray(){
        return _sortedArray;
    }
    
    public String toString(){
        String temp="";
        for(int i=0; i<_sortedArray.length; i++){
            temp = temp+_sortedArray[i]+"\n";
        }
        return temp;
    }
}
