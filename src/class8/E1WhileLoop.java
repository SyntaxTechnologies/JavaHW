package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // write code to print all the numbers from a starting point to an ending point
        // ask the user for starting,ending
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point, ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        int counter=start;

        while(counter<=end){
            System.out.print(counter+" ");
            counter++;
        }

    }
}
