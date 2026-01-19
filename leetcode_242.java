class Solution {
    public boolean isAnagram(String s, String t) {
        int n= s.length();
        int x=t.length();
        if(n!=x){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int j:count){
            if(j!=0){
                return false;
            }
        }
        return true;
    }
}
