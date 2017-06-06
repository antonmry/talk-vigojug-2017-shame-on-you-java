
import java.util.Hashtable;

public class Seven {

    public static void main(String[] args) {

        // create hash table
        Hashtable htable = new Hashtable();

        // put values into the table
        htable.put(1, "A");
        htable.put(2, "B");
        htable.put(3, "C");
        htable.put(4, "D");

        System.out.println(htable.contains(1));
        System.out.println(htable.containsValue("A"));

        // false e false
        // false e true
        // true e false
        // true e true
    }
}

