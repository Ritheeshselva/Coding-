// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        
        for(int i: arr){
            if(i>=0){
                arr1.add(i);
            }
            else{
                arr2.add(i);
            }
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<arr1.size() && j<arr2.size()){
            
            res.add(arr1.get(i++));
            res.add(arr2.get(j++));
        }
        
        while(i<arr1.size()){
            res.add(arr1.get(i++));
        }
        
        
        while(j<arr2.size()){
            res.add(arr2.get(j++));
        }
        
        for (int k = 0; k < arr.size(); k++) {
            arr.set(k, res.get(k));
        }
        
    }
    
}