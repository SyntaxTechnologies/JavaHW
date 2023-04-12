package class4;
/*
Create a Java program and name it Temperature Check.
Create variable to store temperature. Your program should check
if temperature is below 32 then it should print “Water will
freeze with temperature ”, otherwise “Water will NOT freeze with
temperature ”
 */
public class HW2 {
    public static void main(String[] args) {
        int temperature=76;
        if(temperature<32){
            System.out.println("Water will freeze with temperature");
        }else{
            System.out.println("Water will NOT freeze with temperature");
        }
    }
}
