public class leetcode_215 {
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> minqueue = new PriorityQueue<>();
        for(int i:nums){
            minqueue.add(i);
            if(minqueue.size()>k){
                minqueue.poll();
            }
        }
        return minqueue.peek();
    }

}
}
