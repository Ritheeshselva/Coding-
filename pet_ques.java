// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s;
		Scanner ss=new Scanner(System.in);
		s=ss.next();
		int arr[]=new int[26];
		boolean found= false;
		
		for(int i=0;i<s.length();i++){
		    arr[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++){
		    if(arr[s.charAt(i)-'a']==1){
		        System.out.print(s.charAt(i));
		        found=true;
		        break;
		    }
		}
		    
        if(found==false){
           System.out.print("-1");
        }
		
	}
}
