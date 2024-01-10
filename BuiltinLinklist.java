import java.util.LinkedList;
public class BuiltinLinklist {


    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(45);
        ll.addFirst(89);
        ll.addLast(83);
        ll.add(0, 23);
        System.out.println(ll.isEmpty());
        System.out.println(ll.toString());
        ll.offerFirst(56);
        ll.offerLast(45);
        System.out.println(ll);
    }
}

