public class leetcode_238 {
    class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int lft[]=new int[n];
        int ryt[]=new int[n];
        int arr[]=new int[n];

        lft[0]=1;
        for(int i=1;i<n;i++){
        lft[i]=lft[i-1]*nums[i-1];
        }
            
        ryt[n-1]=1;    
           for(int j=n-2;j>=0;j--){
               ryt[j]= ryt[j+1]*nums[j+1];
           }

           for(int k =0;k<n;k++){
            arr[k]=lft[k]*ryt[k];
           }

            return arr;   
        }
    }
}
