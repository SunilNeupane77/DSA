import java.util.Stack;
class Builtinstack {
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack<>();
        ss.push(78);
        ss.push(25);
        
        ss.push(14);
        ss.pop();
        System.out.println(ss.peek());
        System.out.println("Printing all Element");
        System.out.println(ss);

    }
}