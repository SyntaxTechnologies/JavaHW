package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        /*
        Print numbers from 100 to 1
        Print even numbers from 20 to 100
        Print only odd numbers from 100 to 1
         */
        int counter=100;
        while(counter>0){ // same as writing counter>=1
            System.out.print(counter+" ");
            counter--;
        }
        // assigning a new value to the counter for next loop
        counter=20;
        System.out.println();
        while(counter<=100){
            System.out.print(counter+" ");
            counter+=2;
        }

        counter=100;
        // so that we can see the next output on a new line
        System.out.println();
        while (counter>=1){
            // odd numbers when divided by 2 gives 1 as remainder
            if(counter%2==1){ // its as as counter%2!=0
                System.out.print(counter+" ");
            }
            counter--;
        }
    }
}
