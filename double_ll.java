import java.util.*;
class double_ll {
{
	 public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
    public static class double_ll{
        node head,tail;
        public void insert_end(int data){
        node n=new node(data);
        n.next=null;
        n.prev=null;
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
        }
        
        public void insert_front(int data){
            node n = new node(data);
            if(head==null){
                head=n;
                tail=n;
            }
            else{
                n.next=head;
                head.prev=n;
                head=n;
            }
        }
        
        public void insert_spc_pos(int pos,int data){
            node n = new node(data);
            node temp = head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            n.prev=temp;
            temp.next.prev=n;
            temp.next=n;
        }
        
        public void del_end(){
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            tail=tail.prev;
            tail.next=null;
            
        }
        
        public void del_frnt(){
            node temp=head;
            head=head.next;
            head.prev=null;
            
        }
        public void del_spc_pos(int pos){
            node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
           temp.prev.next = temp.next;
           temp.next.prev = temp.prev;
        }
        public void disp(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
	public static void main(String[] args) {
	    double_ll dll = new double_ll();
	    dll.insert_end(10);
	    dll.insert_end(20);
	    dll.insert_end(30);
	    dll.insert_end(40);
	    dll.insert_front(5);
	    dll.insert_spc_pos(2,15);
	    dll.del_end();
	    dll.del_frnt();
	    dll.del_spc_pos(1);
	    dll.disp();
	}
}
}