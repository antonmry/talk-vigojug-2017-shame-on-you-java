
public class Five {

    public static void main(String[] args) {

        Integer[] myInts = {1,2,3,4};
        Number[] myNumber = myInts; // Covariant
        myNumber[0] = 3.14;

        System.out.println(myNumber[0]);

        // 3.14
        // 1
        // Doesn't compile
        // Runtime exception

    }
}

