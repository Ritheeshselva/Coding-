import java.util.ArrayList;
import java.util.Collections;

public class gfg_Prob3 {

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        
        int min_diff =Integer.MAX_VALUE;
        
        for(int i=0; i+m-1<arr.size();i++){
            
            int diff = arr.get(i+m-1)-arr.get(i);
            
            if(diff<min_diff){
                
                min_diff=diff;
            }
        }
        
        return min_diff;
    }
}
}
