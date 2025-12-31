import java.util.Stack;

public class leetcode_206 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
       Stack <Integer> st=new Stack <>();
       while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
       }

       ListNode rev = new ListNode(Integer.MIN_VALUE);
       ListNode ptr = rev;
       while(!st.isEmpty()){
            ptr.next=new ListNode(st.pop());
            ptr=ptr.next;
       }
       return rev.next;
    }
}
}
