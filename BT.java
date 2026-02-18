import java.util.*;

class BinaryTree{
class Node{
    int data;
    Node lft;
    Node ryt;
    Node(int data){
        this.data=data;
    }
}
    Node root;
    public void insert(int data){
        Node n = new Node(data);
        if(root==null){
            root=n;
            return;
        }
        
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.lft==null){
                temp.lft=n;
                return;
            }
            else{
                q.add(temp.lft);
            }
            
            if(temp.ryt==null){
                temp.ryt=n;
                return;
            }
            else{
                q.add(temp.ryt);
            }
        }
    }
    
    public void inorder(Node n){
        if(n==null){
            return;
        }
        else
        {
            inorder(n.lft);
            System.out.print(n.data);
            inorder(n.ryt);
            
        }
    }
    
    public void preorder(Node n){
        if(n==null){
            return;
        }
        else
        {
            System.out.print(n.data);
            preorder(n.lft);
            preorder(n.ryt);
            
        }
    }
    
    public void postorder(Node n){
        if(n==null){
            return;
        }
        else
        {
            postorder(n.lft);
            postorder(n.ryt);
            System.out.print(n.data);
            
            
        }
    }
    
    public void bfs(){
        if (root==null) return;
        
        Queue<Node> qq = new LinkedList<>();
        qq.add(root);
        
        while(!qq.isEmpty()){
            Node t=qq.poll();
            System.out.print(t.data);
            if(t.lft!=null){
                qq.add(t.lft);
            }
            if(t.ryt!=null){
                qq.add(t.ryt);
            }
        }
    }

}

public class Main
{
	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	int a;
	a=ss.nextInt();
	int []arr=new int[a];
	for(int i=0;i<a;i++){
	    arr[i]=ss.nextInt();
	}
	BinaryTree bt = new BinaryTree();
	for(int i: arr){
	    bt.insert(i);
	}
	System.out.println("Inorder");
	bt.inorder(bt.root);
	
	System.out.println("\npreorder");
	bt.preorder(bt.root);
	
	System.out.println("\npostorder");
	bt.postorder(bt.root);
	
	System.out.println("\nbfs");
	bt.bfs();
	
	
	}
}