package class2;

public class FaceBookExample {
    public static void main(String[] args) {

        String firstName="Farwa";
        String surName="Ali";
        // using int or long for mobile numbers
        // can lead to issues
        //int mobileNumber=00777_985_5070;
        //System.out.println(mobileNumber);
         String mobileNumber="+1777-985-5070";
         String password="Pass@123";
         int dayOfMonth=7;
         String month="Mar";
         int year=2023;
         String gender="Female";

        System.out.println(firstName+" "+surName);
        System.out.println(mobileNumber);
        System.out.println(password);
        System.out.println(dayOfMonth+" "+month+" "+year);
        System.out.println(gender);

    }
}
