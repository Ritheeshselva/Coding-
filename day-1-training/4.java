package day-1-training;

public class 4 {
    class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);
        return nums[n/2];
    }
}
}
