package class7;

public class E7WhileLoop {
    public static void main(String[] args) {
        // print these numbers in one line 3 5 7 9 11 13 with a while loop
        int counter=3;

        while (counter<14){ // same as counter<=13
            System.out.print(counter+" ");
            counter+=2;
        }
    }
}
