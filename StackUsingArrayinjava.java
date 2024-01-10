class StackArr{
    Integer arr[]=new Integer[12];
    int tos=-1;
    public boolean isEmpty(){
        if(tos==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int el){
        if(tos==arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            tos++;
            arr[tos]=el;
        }
    }
    public void pop(){
        if(tos==-1){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            tos--;
        }
    }
    public void peek(){
        if(tos==-1){
            System.out.println("Non such element");
        }
        else{
            System.out.println(arr[tos]);
        }
    }
}
public class StackUsingArrayinjava {
public static void main(String[] args) {
    StackArr  stk=new StackArr();
    stk.push(78);
    stk.push(23);
    stk.push(89);
    stk.pop();
    stk.peek();
}    
}
