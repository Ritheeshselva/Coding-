class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length+1];
        int miss=0;
        int rep=0;

        for (int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i=1;i<=nums.length;i++){
            if(freq[i]==2){
                rep=i;
            }
            if(freq[i]==0){
                miss=i;
            }
        }

        int []arr = {rep,miss};
        return arr;
    }

}