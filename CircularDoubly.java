// class Node{
//     int data;
//     Node prev,next;
//     Node(Node prev,int data,Node next){
//         this.data=data;
//         this.next=next;
//         this.prev=prev;
//     }
// }
// class CircularDoubbly{
//    Node head,tail;
//    public boolean isEmpty(){
//     return head==null && tail==null;
//    }
//    public void insertHead(int el){
//     if (isEmpty()) {
//         head=tail=new Node(null, el, null);
//     }
//     else{
//         head=new Node(tail, el, head);
//         head.next.prev=head;
//         tail.next=head;
//     }
//    }
//    public void insertTail(int el){
//     if(isEmpty()){
//         head=tail=new Node(null, el, null);
//     }
//     else{
//         tail=new Node(tail, el, head);
//         tail.prev.next=tail;
//         head.prev=tail;
//     }
//    }
//    public void deleteHead(){
//     if (isEmpty()) {
//         System.out.println("Unable to deletr from empty node ");
//     }
//     else if (head==tail) {
//         head=tail=null;
//     }else{
//       head=head.next;
//       head.prev=null;
//       tail.next=head;
//     }
//    }
//    public void deleteTail(){
//     if(isEmpty()){
//         System.out.println("Unable To delete From empty Node ");

//     }
//     else if (head==tail) {
//         head=tail=null;
//     }
//     else{
//         tail=tail.prev;
//         tail.next=null;
//         head.prev=tail;
//     }
//    }
//    public void PrintForward(){
//     Node temp=head;
//     while (temp!=tail.next) {
//         System.out.println(temp.data);
//         temp=temp.next;
//     }
//    }
//    public void PrintBackwatd(){
//     Node temp=tail;
//     do{
//      System.out.println(temp.data);
//      temp=temp.prev;
//     }while(temp!=head.prev);
//    }
// }

// public class CircularDoubly {
//      public static void main(String[] args) {
//       CircularDoubbly dd=new CircularDoubbly();
//           System.out.println(dd.isEmpty());
//           dd.insertHead(78);
//           dd.insertHead(56);
//           dd.insertTail(250);
//           dd.insertHead(5);
//           dd.insertTail(1);
//           dd.insertHead(60);
//           dd.insertTail(30);
//           dd.deleteTail();
//           dd.deleteTail();
//           System.out.println("Print forward");
//           dd.PrintForward();
//           System.out.println("Print Backward");
//           dd.PrintBackwatd();
//     }
// }
