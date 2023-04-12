package class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        // print 25 20 10 5 using a while loop Hint using if conditions
        int counter=25;
        while (counter>=5){
            if(counter!=15){
                System.out.print(counter+" ");

            }
            counter-=5;
        }
    }
}
