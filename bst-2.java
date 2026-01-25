/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Node{
    int data;
    Node lft;
    Node ryt;
    Node(int data){
        this.data=data;
    }
}

public class Bst{
    Node root;
    public void insert(int data){
        root=insertrec(root,data);
    }
    public Node insertrec(Node root,int data){
        if(root==null){
            root= new Node(data);
        }
        
        else if(data<root.data){
            root.lft = insertrec(root.lft,data);
        }
        
        else if(data>root.data){
            root.ryt = insertrec(root.ryt,data);
        }
        
        return root;
    }
    
    public void inorder(){
        inorderrec(root);
    }
    public void preorder(){
        preorderrec(root);
    }
    public void postorder(){
        postorderrec(root);
    }   
    public void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.lft);
            System.out.print(root.data+ " ");
            inorderrec(root.ryt);
        }
    }
    public void preorderrec(Node root){
        if(root!=null){
            System.out.print(root.data+ " ");
            preorderrec(root.lft);
            preorderrec(root.ryt);
        }
    }
    public void postorderrec(Node root){
        if(root!=null){
            postorderrec(root.lft);
            postorderrec(root.ryt);
            System.out.print(root.data+ " ");
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
		
		obj.inorder();
	}
}
