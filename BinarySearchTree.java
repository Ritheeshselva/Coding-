import java.util.*;

class Bst{
    
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
       root = insert_rec(root, data);
            
    }
    public Node insert_rec(Node root,int data){
        if(root == null){
            root=new Node(data);
        }
        
        else if(root.data>data){
            root.lft=insert_rec(root.lft,data);
        }
        
        else if(root.data<data){
            root.ryt=insert_rec(root.ryt,data);
        }
        return root;
    }
    
    public void inorder(){
        inorder_rec(root);
    }
    public void inorder_rec(Node root){
         if(root == null) return;
        inorder_rec(root.lft);
        System.out.print(root.data);
        inorder_rec(root.ryt);
    }
    
    public void preorder(){
       
        preorder_rec(root);
    }
    public void preorder_rec(Node root){
         if(root == null) return;
        System.out.print(root.data);
        preorder_rec(root.lft);
        preorder_rec(root.ryt);
    }
    
      public void postorder(){
        postorder_rec(root);
    }
    public void postorder_rec(Node root){
         if(root == null) return;
        postorder_rec(root.lft);
        postorder_rec(root.ryt);
        System.out.print(root.data);
    }
    
    public void bfs(){
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return;
        }
        
        q.add(root);
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data);
            
            if(temp.lft!=null){
                q.add(temp.lft);
            }
            if(temp.ryt!=null){
                q.add(temp.ryt);
            }
        }
    }
}

public class BinarySearchTree{
	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	int a;
	a=ss.nextInt();
	int []arr=new int[a];
	for(int i=0;i<a;i++){
	    arr[i]=ss.nextInt();
	}
	Bst bt = new Bst();
	for(int i: arr){
	    bt.insert(i);
	}
	System.out.println("Inorder");
	bt.inorder();
	
	System.out.println("\npreorder");
	bt.preorder();
	
	System.out.println("\npostorder");
	bt.postorder();
	
	System.out.println("\nbfs");
	bt.bfs();
	}
}