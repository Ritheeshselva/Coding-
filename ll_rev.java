// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class ll {
    Node head,tail;
    public void add(int data){
        Node n = new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void rev(){
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp= cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        head=prev;
    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
class Main {
    public static void main(String[] args) {
    ll obj = new ll();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.rev();
        obj.disp();
    }
}