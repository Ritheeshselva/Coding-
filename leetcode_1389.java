import java.util.*;
class leetcode_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            list.add(index[i],nums[i]);
        }
        int tar[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            tar[i]=list.get(i);
        }    
    return tar;
    }
}