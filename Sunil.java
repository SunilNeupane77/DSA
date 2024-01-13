class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
class SingleLinklist{
    Node head,tail;
    public boolean isEmpty(){
        return  head==null &&tail==null;
    }
    
}