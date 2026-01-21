class Solution {
    public String reverse(String S) {
        // code here
     Stack<Character> s= new Stack<>();
     for(char i : S.toCharArray()){
         s.push(i);
     }
     
     StringBuilder sb = new StringBuilder();
     
     while(!s.isEmpty()){
         sb.append(s.pop());
     }
     
     return sb.toString();
    }
}