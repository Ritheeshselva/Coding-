class Solution {
    public int findDuplicate(int[] nums) {
        int a=0;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                a=nums[i];
            }
             hs.add(nums[i]);
        }
        return a;
    }
}