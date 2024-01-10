import java.util.LinkedList;
class Stack{
    LinkedList<Integer> ll=new LinkedList<>();
    public void push(Integer el){
        ll.addFirst(el);;
    }
    public void pop(){
        if(ll.isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            ll.removeFirst();
        }
    }
    public Integer peek(){
        if(ll.isEmpty()){
            return null;
        }
        else{
            return ll.getFirst();
        }
    }
}

class StackUsingLinklist {
    public static void main(String[] args) {
        Stack ss=new Stack();
        ss.push(89);
        ss.push(23);
        ss.push(90);
        ss.push(24);
        ss.push(12);
        ss.pop();
        ss.pop();
        System.out.println(ss.peek());
    }
}