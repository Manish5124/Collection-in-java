import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> a = new Vector<>();
        a.add("Manish");
        a.add("Anish");
        a.add("Nish");
        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
