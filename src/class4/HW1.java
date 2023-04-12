package class4;
/*
Create a Java program and name it DoubleComparison.
Declare 2 double values and if value of first variable is
higher then the second, print “Double value  is larger than
.” Otherwise print
 */
public class HW1 {
    public static void main(String[] args) {
        double num1=15;
        double num2=20;

        if(num1>num2){
            System.out.println("Double number "+num1+" is greater than "+num2);
        }else {
            System.out.println("Double number "+num2+" is greater than "+num1);
        }
    }
}
