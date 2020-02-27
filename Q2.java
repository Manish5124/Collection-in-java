import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Manish");
        a1.add("Chouhan");
        a1.add("abc");
        a1.add("def");


        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}





