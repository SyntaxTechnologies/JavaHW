package class4;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

        // Break till 1:53
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you Hungry Enter true/false");
        boolean hungry=scanner.nextBoolean();
        if(hungry){
            System.out.println("Let's order Pizza");
        }else {
            System.out.println("Let's practice java");
        }

    }
}
