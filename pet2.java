 import java.util.*;

public class pet2 {
{
	public static void main(String[] args) {
	    String a ;
	    boolean found = false;
	    Scanner sc = new Scanner(System.in);
	    a=sc.next();
	    int n = a.length();
	    for(int i=0;i<n;i++){
	        int count=0;
	        for(int j=0;j<n;j++){
	            if(a.charAt(i)==a.charAt(j)){
	                count++;
	            }
	        }
	        if(count==1){
	            System.out.print(a.charAt(i));
	            found = true;
	            break;
	        }
	    }
	    if(!found){
	        System.out.print("-1");
	    }
	}
}
}
