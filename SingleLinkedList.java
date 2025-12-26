public class SingleLinkedList {
    public class Main{ 
    
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        
    }
    
    public static class linked_list{
        
        node head,tail;
        public void insert_end(int data){
            node n = new node(data);
            n.next = null;
            if(head==null){
                head=n;
                tail=n;
            }
            else{
                tail.next=n;
                tail=n;
            }
        }
        
        public void insert_Front(int data){
            node n = new node(data);
            if(head==null){
                head=n;
                tail=n;
            }
            else{
                n.next=head;
                head=n;
            }
        }
        
        public void insert_SpecPos(int pos, int data){
            node n=new node(data);
            node temp = head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            
            n.next=temp.next;
            temp.next=n;
            
        }
        
        public void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
    }
    
	public static void main(String[] args) {
	
	linked_list ll = new linked_list();
	ll.insert_end(10);
	ll.insert_end(20);
	ll.insert_Front(5);
	ll.insert_SpecPos(1,15);
	ll.display();
	
	}
}
}
