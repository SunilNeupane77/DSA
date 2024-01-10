// /**
//  * Doubly Linked list Code Written By Sunil Neupane 
//  */
// class Node{
//     int data;
//     Node prev,next;
//     Node(Node prev,int data,Node next){
//         this.prev=prev;
//         this.next=next;
//         this.data=data;
//     }
// }
// class Doubly{
//     Node head,tail;
//     public boolean isEmpty(){
//         return head==null && tail==null;
//     }
//     public void  insertfromhead(int el){
//        if(isEmpty()){
//         head=tail=new Node(null, el, null);
//        }
//    else{
//         head=head.prev=new Node(null, el, head);
        
//  }
//     }
//     public void insertfromtail(int el){
//         if (isEmpty()) {
//             head=tail=new Node(null, el, null);
            
//         }
//         else{
//             tail=tail.next=new Node(tail, el, null);
        
//         }
//     }
//     public void Display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
//     public void Displayreverse(){
//         Node temp=tail;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.prev;
//         }
//     }
//     public void deletefromhead(){
//         if (isEmpty()) {
//             System.out.println("Unable To delete from empty node ");
//         }
//         else if(head==tail){
//           head=tail=null;  
//         }
//         else{
//             head=head.next;
//             head.prev=null;
//         }

//     }
//     public void deletefromtail(){
//         if (isEmpty()) {
//             System.out.println("Unable to delete from Empty node ");
//         }
//         else if (head==tail) {
//             head=tail=null;
//         }
//         else{
//             tail=tail.prev;
//             tail.next=null;
//         }
//     }
// }
// class DoublyLinkedList {
//     public static void main(String[] args) {
//         Doubly dd=new Doubly();
//         System.out.println(dd.isEmpty());
//         dd.insertfromhead(78);
//         dd.insertfromhead(56);
//         dd.insertfromhead(23);
//         dd.insertfromhead(56);
//         dd.insertfromhead(82);
//         dd.insertfromhead(26);
//         dd.insertfromtail(85);
//         dd.insertfromtail(17);
//         dd.insertfromtail(45);
//         dd.deletefromhead();
//         dd.deletefromtail();
//         dd.Display();
//         System.out.println("-----------------");
//         dd.Displayreverse();
//     }
// }