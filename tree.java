/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static class bst{
    
    public class Node{
        int data;
        Node lft;
        Node ryt;
        Node(int data){
            this.data=data;
        }
    }
    
        Node root;
        
        public void insert(int data){
            root=insert_rec(root,data);
        }
        
        public Node insert_rec(Node root,int data){
            if(root==null){
                root=new Node (data);
            }
            
            if(root.data<data){
                root.lft=insert_rec(root.lft , data);
            }
            if(root.data>data){
                root.ryt=insert_rec(root.ryt,data);
            }
            
            return root;
        }
    public void inord(){
        inord_rec(root);
    }
    
    public void inord_rec(Node root){
        if(root==null) return;
        inord_rec(root.lft);
        System.out.print(root.data);
        inord_rec(root.ryt);
        
    }
    
    public void bfs(){
        Queue<Node> q = new LinkedList<>();
        if(root==null) return;
        
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data);
            
            if(temp.lft !=null){
                q.add(temp.lft);
            }
            if(temp.ryt!=null){
                q.add(temp.ryt);
            }
        }
    }
    public boolean sym(){
        return sym_rec(root.lft,root.ryt);
    }
    public boolean sym_rec(Node lft,Node ryt){
        if(lyt==null && ryt == null){
            return true;
        }
        if(lft==null || ryt==null){
            return false;
        }
        
        if(lft.data!=ryt.data){
            return false;
        }
        
        return sym_rec(lft.lft , ryt.ryt) &&
        sym_rec(lft.ryt,ryt.lft);
    }
    
    public int h(){
        return h_rec(root);
    }
    
    public int h_rec(Node root){
        if(root==null) return 0;
        
        int lft = h_rec(root.lft);
        int ryt= h_rec(root.ryt);
        
        return Math.max(lft,ryt) +1;
    }
    
    public void lef(){
        lef_rec(root);
    }
    
    public void lef_rec(Node root){
        if(root==null) return;
        
        if(root.lft==null && root.ryt==null){
            System.out.print(root.data);
        }
        lef_rec(root.lft);
        lef_rec(root.ryt);
    }
    
    int longe=0;
    
    public int uni(){
        path(root);
        return long;
    }
    
    public int path(Node root){
        if(root==null){
            return 0;
        }
        
        int l = path(root.lft);
        int r = path(root.ryt);
        int lp=0;
        int rp=0;
        if(root.lft != null && root.lft.data==root.data){
            lp=l+1;
        }
        if(root.ryt != null && root.ryt.data==root.data){
            rp=r+1;
        }
        
        longe = Math.max(longe,lp+rp);
        
        return Math.max(lp.rp);
    }
     
    public void del(){
       root= del_rec(root);
    }
    
    public Node del_rec(Node root){
     root.lft=del_rec(root.lft);
     root.ryt=del_rec(root.ryt);
     if(root==null) return;
     
     if(root.lft==null && root.ryt!=null ){
         return root.ryt;
     }
     if(root.ryt==null && root.lft!=null){
         return root.lft;
     }
     
     return root;
    }
     int d=0;
    public int dia(){
        dia_rec(root);
        return d;
    }
    public int dia_rec(Node root){
        if(root==null) return ;
        int lf = dia_rec(root.lft);
        int ry = dia_rec(root.ryt);
        
        d = Math.max(d,lf+ry);
        return 1 + Math.max(lf.ry);
    }
    
        public Node lca(int a , int b){
            return lca_rec(root , a,b);
        }
        
        public Node lca_rec(Node root , int a , int b){
            if(root == null) return null;
            
            if(root.data==a || root.data==b){
                return root;
            }
            
             Node li=lca_rec(root.lft,a,b);
            Node ri = lca_rec(root.ryt,a,b);
            if(li!=null && ri!=null){
                return root;
            }
            
            if(li!=null){
                return li;
            }
            
            return ri;
            
        }
    }

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a;
		a=ss.nextInt();
		int arr[]=new int[a];
		for(int i =0 ; i<a;i++){
		    arr[i]=ss.nextInt();
		}
		
		bst obj = new bst();
		for(int i=0;i<a;i++){
		    obj.insert(arr[i]);
		}
	}
}