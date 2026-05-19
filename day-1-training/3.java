package day-1-training;

public class 3 {
    class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int max=0;
        int c=0;
        for(int i=0;i<n;i++){
          max = Math.max(max,arr[i]);
          if(max==i){
            c++;
          }
        }

        return c;
    }
}
}
