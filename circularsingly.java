class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
class CircularDemo{
    Node head,tail;
    public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void insertHead(int el){
       if (isEmpty()) {
        head=tail=new Node(el, null);
       }
       else{
        head=new Node(el, head);
       }
    }
    public void insertTail(int el){
       if (isEmpty()) {
        head=tail=new Node(el, null);
       }
       else{
        tail=tail.next=new Node(el, head);
       }
    }
    public void deleteHead(){
       if (isEmpty()) {
        System.out.println("Unable To delete from Empty Node");
       }
       else if (head==tail) {
        head=tail=null;
        
       }
       else{
        head=head.next;
        tail.next=head;
       }
    }
    public void deleteTail(){
       if (isEmpty()) {
        System.out.println("Unable TO delete from empty node ");
       }
       else if (head==tail) {
        head=tail=null;
       }else{
        Node temp=head;
        while (temp.next!=tail) {
            temp=temp.next;
        }
        tail=temp;
        temp.next=head;
       }
    }
    public void display(){
      Node temp=head;
      do{
      System.out.println(temp.data);
      temp=temp.next;
      }while(temp!=tail.next);
    }
}

class circularsingly {
    public static void main(String[] args) {
     CircularDemo cc=new CircularDemo();
     cc.insertHead(890);
     cc.insertHead(780);
     cc.insertTail(74);
     cc.insertHead(250);
     cc.insertTail(25);
     cc.insertTail(23);
     cc.deleteHead();
     cc.deleteTail();
     cc.display();       
    }
}