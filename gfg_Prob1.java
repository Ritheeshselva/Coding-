import java.util.ArrayList;
import java.util.Collections;

public class gfg_Prob1 {
    class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // ***Brute force approach***

       // int max=arr[0];
        //int min=arr[0];
        //for(int i=0; i<arr.length;i++){
            
          // if(arr[i]<min){
            //    min=arr[i];
        //    }
            
          //  if(arr[i]>max){
            //    max=arr[i];
        //    }
    //    }
        
      //  ArrayList<Integer> result=new ArrayList<>();
        //result.add(min);
    //    result.add(max);
      //return result;
      
      // ***Optimized approach***

      ArrayList <Integer> sorted = new ArrayList<>();
      for (int num:arr){
          sorted.add(num);
          
      }
      
      Collections.sort(sorted);
      
      ArrayList<Integer> result=new ArrayList<>();
      
      result.add(sorted.get(0));
      result.add(sorted.get(sorted.size()-1));
      
      return result;
      
      
    }
}

}
