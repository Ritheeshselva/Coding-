public class gfg_Prob2 {
    class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            
            ar[i]=arr[n-1-i];
        }
        
        for(int i=0;i<n;i++){
            
            arr[i]=ar[i];
        }
    }
}