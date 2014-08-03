

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
