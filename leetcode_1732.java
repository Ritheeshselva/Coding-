public class leetcode_1732 {
    public int largestAltitude(int[] gain) {
        int pref[]=new int[gain.length+1];
        pref[0]=0;
        int max=0;
        int sum =0;
        for(int i=0;i<gain.length;i++){
         sum += gain[i];
        pref[i+1]=sum;
        if(max<sum){
            max=sum;
        }
        }
        return max;
    }
} 
