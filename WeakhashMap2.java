//Q.8
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeakhashMap2 {
    public static void main(String[] args) {
        Map<Number, String> a = new HashMap<>();
        a.put(1, "manish");
        a.put(2, "anish");
        a.put(3, "nish");
        Set set = a.entrySet();
        System.out.println(set);
        Set keySet = a.keySet();
        System.out.println("keyset is:" + keySet);

    }
}
