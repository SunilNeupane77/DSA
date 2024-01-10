// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     Node(int data,Node next){
//         this.data=data;
//         this.next=next;
//     }
// }
// class Slinkedlist{
//     Node head,tail;
//     public boolean isEmpty(){
//         return head==null && tail==null;
//     }
//     public void insertromtail(int el){
//         if(isEmpty()){
//             head=tail=new Node(el);
//         }
//         else{
//             tail=tail.next=new Node(el, null);
//         }
//     }
//     public void insertromhead(int el){
//         if(isEmpty()){
//             head=tail=new Node(el);
//         }
//         else{
//             head=new Node(el, head);
//         }
//     }
//     public void Display(){
//         Node temp=head;
//         while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
//     public void deletefromhead(){
//         if (isEmpty()) {
//             System.out.println("Unable to delete from empty node ");
//         }
//         else if (head==tail) {
//             head=tail=null;
//         }
//         else{
//             head=head.next;
//         }
//     }
//     public void deletefromtail(){
//         if (isEmpty()) {
//             System.out.println("Unable To delete from empty node ");
//         }
//         else if (head==tail) {
//             head=tail=null;
//         }
//         else{
//         Node temp=head;
//         while (temp.next!=null) {
//             temp=temp.next;
//              temp.next=null;
//         }
    
//         tail=temp;
//     }
// }
// }
// class Singlylinklist {
//     public static void main(String[] args) {
        
//         Slinkedlist ss=new Slinkedlist();
//         ss.insertromhead(45);
//         ss.insertromhead(89);
//         ss.insertromhead(56);
//         ss.insertromhead(47);
//         ss.insertromtail(12);
//         ss.insertromtail(23); 
//         System.out.println("Before Deletion ");
//         ss.Display();
//         ss.deletefromhead();
//         ss.deletefromhead();
//         ss.deletefromtail();
//         ss.deletefromtail();
//         System.out.println("After Deletion");
//         ss.Display();

//     }
// }