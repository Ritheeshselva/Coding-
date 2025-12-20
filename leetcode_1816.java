class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String b ="";
        for(int i=0;i<k;i++){
            if(i==0){
                b += arr[i];
            }
            else{
            b=b+" "+arr[i];
            }
        }
    return b;
    }
}