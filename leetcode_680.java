public class leetcode_680 {
    class Solution {
    public boolean validPalindrome(String s) {
      int lft = 0;
      int ryt=s.length()-1;

      while(lft<ryt){
        if(s.charAt(lft) != s.charAt(ryt)){
            return ispali(s,lft+1,ryt) || ispali(s,lft,ryt-1);
        }
        lft++;
        ryt--;
      }
      return true;
      }

public boolean ispali(String s,int l, int r){
    while(l<r){
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        l++ ;
        r-- ;
        }
        return true;
    }
}
}
