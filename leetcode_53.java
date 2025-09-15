public class leetcode_53 {
    public int maxSubArray(int[] nums) {
       int max = nums[0];
       int arr= nums[0];
       for(int i=1;i<nums.length;i++) {

        arr=Math.max(nums[i],nums[i]+arr);
        max=Math.max(arr,max);

       }
       return max;
    }
}
