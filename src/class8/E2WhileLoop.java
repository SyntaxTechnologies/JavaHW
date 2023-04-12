package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        // Ask the user to enter numbers if user enters any number
        // other then -1 print "Try again" and keep on asking the user for a number
        // the moment user enters the number -1 the loop should stop
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number=scanner.nextInt();

        while (number!=-1){
            System.out.println("Try again");
            number=scanner.nextInt();
        }

    }
}
