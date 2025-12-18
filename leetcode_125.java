public class leetcode_125 {
    class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int n; 
        n=s.length();
        if(n==0){
            return true;
        }
        for(int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
        }
}
}
