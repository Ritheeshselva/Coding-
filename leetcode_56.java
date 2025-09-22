import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_56 {
       public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int prev[]=intervals[0];
        List<int[]> merg=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);

            }
            else{
                merg.add(prev);
                prev=intervals[i];
            }
        }
        merg.add(prev);
        return merg.toArray(new int[merg.size()][]);

    }
}
