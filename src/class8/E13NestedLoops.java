package class8;

import java.net.SocketTimeoutException;

public class E13NestedLoops {
    public static void main(String[] args) {

        /*
         1 2 3 4 5
         2 3 4 5 6
         3 4 5 6 7
         */

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }

    }
}
