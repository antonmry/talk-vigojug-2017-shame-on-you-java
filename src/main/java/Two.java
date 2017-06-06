
public class Two {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hel" + "lo";
        String s3 = " mum";

        System.out.println(s1 == s2);
        System.out.println(s1 + s3 == "hello mum");

        // true, true
        // true, false
    }
}

