import java.util.Arrays;

public class interviewBit1 {
    public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int dup=0;
        int miss=0;
        int a=1;
        Arrays.sort(A);
        for(int i=1;i<A.length;i++){
            if(A[i]==A[i-1]){
                dup=A[i];
            }
        }
        
        for(int i=0;i<A.length;i++){
            if(A[i]==a){
                a++;
            }
            miss=a;
        }
        return new int[]{dup,miss} ;
    }
}
                
}
