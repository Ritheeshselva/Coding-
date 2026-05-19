class Solution {
    void nextPermutation(int[] arr) {
        // code here
        
        int index=-1;
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        
        if(index==-1){
            rev(arr,0,arr.length-1);
            return;
        }
        
        for(int i=arr.length-1;i>index;i--){
            if(arr[index]<arr[i]){
                swap(arr,index,i);
                break;
            }
        }
        
        
        rev(arr,index+1,arr.length-1);
    }
        
        static void rev(int arr[], int st,int end){
            
            while(st<end){
                swap(arr,st,end);
                st++;
                end--;
            }
        }
        
        static void swap(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    
}