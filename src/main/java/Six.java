
public class Six {

    public static void main(String[] args) {

        String s = "foo";

        String s1 = s.concat("bar");
        String s2 = s + "bar";
        System.out.println(s1 == s2);

        // False
        // True

        String s3 = s.concat("");
        String s4 = s + "";
        System.out.println(s == s3);
        System.out.println(s == s4);

        // false e false
        // false e true
        // true e false
        // true e true

        String s5 = "".concat(s);
        String s6 = s.concat("");

        // System.out.println(s == s5);
        // System.out.println(s == s6);

        // false e false
        // false e true
        // true e false
        // true e true


    }
}

