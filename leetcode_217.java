import java.util.HashSet;

public class leetcode_217 {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
    int s = nums.length;
        HashSet <Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
    int n = set.size();

    if(n==s){
        return false;
    }
    else{
        return true;
    }
    }
}
}