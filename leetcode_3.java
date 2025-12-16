import java.util.HashSet;

public class leetcode_3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int max=0;
        for(int i=0; i<n;i++){
            HashSet<Character> charset = new HashSet<>(); 
            for(int j=i; j<n;j++){
                if(charset.contains(s.charAt(j))){
                    break;
                }
                else{
                    charset.add(s.charAt(j));
                    max=Math.max(max,j-i+1);
                }

            }

        }
        return max;
    }
}
}
