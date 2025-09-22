import java.util.Arrays;

public class leetcode_169 {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
         int n = nums.length;
         return nums[n/2];
    }
}q
