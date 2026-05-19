package day-1-training;

public class 1 {
    class Solution {
    public boolean checkDuplicates(int arr[]) {
           HashSet<Integer> h = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        
        if(arr.length!=h.size()){
            return true;
    }
    else{
        return false;
    }
        
    }
}
}
