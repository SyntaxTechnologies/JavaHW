package class9;

public class E7Arrays {
    public static void main(String[] args) {

        boolean[] flags={true,false,true,false,false,true,false};
        // write a loop to count how many values in above array are false
        int counter=0;
        for (int i = 0; i < flags.length; i++) {

            if(!flags[i]){
               counter++;

            }
        }
        System.out.println(counter);
    }
}
