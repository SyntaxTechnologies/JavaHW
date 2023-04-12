package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10=>
        // write a loop to add all the even numbers from 1 to 10  for example from 1 to 7 {2 4 6} =12
        int sum=0; // creating a variable to hold the sum

        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){ // checking if a number is even
                sum=sum+i; // sum+=i; // adding all the even numbers to the sum variable one by one
            }

        }
        System.out.println(sum);

    }
}
