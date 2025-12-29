public class bst {
     public class Main{
  
  public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    
    public static class BST{
        node root;
        
        public void insert(int data){
           root= insert_rec(root,data);
        }
        
        public node insert_rec(node root,int data){
            if(root==null){
                root=new node(data);
            }
            
            else if(root.data>data){
                root.left=insert_rec(root.left,data);
            }
            
            else if(root.data<data){
                root.right=insert_rec(root.right,data);
            }
            
            return root;
        }
            
            public void in_ord(){
                in_ord_rec(root);
            }
            
            public void in_ord_rec(node root){
                
                if(root!=null){
                    in_ord_rec(root.left);
                    System.out.print(root.data+" ");
                    in_ord_rec(root.right);
                }
            }

        
    }
    
   
    
	public static void main(String[] args) {
		BST obj = new BST();
		obj.insert(8);
		obj.insert(7);
		obj.insert(12);
		obj.insert(15);
		obj.insert(2);
		obj.insert(5);
		
		obj.in_ord();
	}
}
}
