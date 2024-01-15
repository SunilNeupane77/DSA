//import com.sun.security.jgss.GSSUtil;
//
//class Node{
//    int data;
//    Node prev,next;
//    Node(Node prev,int data,Node next){
//        this.data=data;
//        this.next=next;
//        this.prev=prev;
//    }
//}
//class DoubleLink{
//    Node head,tail;
//    public boolean isEmpty(){
//        return head==null && tail==null;
//    }
//    public void insertHead(int el){
//        if (isEmpty()){
//            head=tail=new Node(null,el,null);
//        }
//        else{
//            head=head.prev=new Node(null,el,head);
//        }
//    }
//    public void insertTail(int el){
//        if (isEmpty()){
//            head=tail=new Node(null,el,null);
//        }
//        else{
//            tail=tail.next=new Node(tail,el,null);
//        }
//    }
//public void PrintForward(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//}
//    public void Printbackward(){
//        Node temp=tail;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.prev;
//        }
//    }
//    public void Deletehead(){
//        if (isEmpty()){
//            System.out.println("Unable To delete from empty head");
//        }
//        else if (head==tail){
//            head=tail=null;
//        }
//        else{
//            head=head.next;
//            head.next=null;
//        }
//    }
//    public void deleteAtTail(){
//        if (isEmpty()){
//            System.out.println("Unable To delete from empty node ");
//        }
//        else if (head==tail){
//            head=tail=null;
//        }
//        else {
//            tail=tail.prev;
//            tail.next=null;
//        }
//    }
//}
//
//public class DoubleLinkedlist {
//    public static void main(String[] args) {
//DoubleLink dd=new DoubleLink();
//dd.insertHead(45);
//dd.insertHead(25);
//dd.insertHead(58);
//dd.insertHead(21);
//dd.insertTail(25);
//dd.insertTail(89);
//        System.out.println("Before Deletion");
//        System.out.println("For print forward ");
//        dd.PrintForward();
//        System.out.println("For PrintBackward");
//        dd.Printbackward();
//        dd.deleteAtTail();
//        dd.Deletehead();
//        dd.deleteAtTail();
//        System.out.println("After Deletionl");
//        System.out.println("Print Forward");
//        dd.PrintForward();
//        System.out.println("Print Backeard");
//        dd.Printbackward();
//    }
//}
