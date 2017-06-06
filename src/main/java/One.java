
public class One {

    public static void main(String[] args) {

        Integer int1_1 = Integer.valueOf("1");
        Integer int1_2 = Integer.valueOf(1);

        System.out.println(int1_1 == int1_2);
        System.out.println(int1_1.equals(int1_2));

        // false e true
        // true e true

        Integer int2_1 = Integer.valueOf("1000");
        Integer int2_2 = Integer.valueOf(1000);

        // System.out.println((int2_1 == int2_2));
        // System.out.println(int2_1.equals(int2_2));

        // false e true
        // true e true

    }
}
