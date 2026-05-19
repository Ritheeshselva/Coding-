package day-1-training;

public class 5 {
    class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int b = 0;
        int n= people.length;
        int l=0;
        int r=n-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }

            r--;
            b++;
        }
        return b;
    }
}
}
