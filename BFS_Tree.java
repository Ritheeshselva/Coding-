/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Node{
    int data;
    Node lft,ryt;
    Node(int data){
        this.data=data;
    }
}
class Bst{
    Node root;
    public void insert(int data){
        root=insertrec(root,data);
    }
    public Node insertrec(Node root,int data){
        if(root==null){
            root=new Node (data);
        }
        else if(root.data>data){
            root.lft=insertrec(root.lft,data);
        }
        else if(root.data<data){
            root.ryt=insertrec(root.ryt,data);
        }
        
        return root;
    }
    
    public void bfs(){
        if(root==null) return;
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node cur=q.poll();
            
            System.out.print(cur.data + " ");
            if(cur.lft!=null) q.add(cur.lft);
            if(cur.ryt!=null) q.add(cur.ryt);
        }
    }
   
    
}
public class Main
{
	public static void main(String[] args) {
		Bst obj = new Bst();
		obj.insert(8);
		obj.insert(7);
		obj.insert(12);
		obj.insert(15);
		obj.insert(2);
		obj.insert(5);
		obj.bfs();
	}
}
