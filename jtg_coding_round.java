import java.util.*;
public class jtg_coding_round {
    
class Main {
    public static void main(String[] args) {
        int []x={1,1,3,4};
        int []y={5,4,1,1};
        int k=2;
        int sum=0;
        for(int i=0;i<4;i++){
            sum += y[i];
        }
        
        int []z=new int[4];
        int sub;
        
        for(int i=0;i<4;i++){
            sub = x[i]-y[i];
            z[i]=sub;
        }
        
        Arrays.sort(z);
        int nsum=0;
        for(int i=4-1;i>=k;i--){
            nsum += z[i];
        }
        
        int res;
        res= sum+nsum;
        
        System.out.print(res);
        
    }
}
}
