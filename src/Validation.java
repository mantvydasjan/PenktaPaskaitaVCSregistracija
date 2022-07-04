import java.util.Scanner;

public class Validation {

    private String inputString;
    private int inputInt;




    public static int ageValidation(int inputInt) {
        

        if (inputInt > 16 ) {
            return inputInt;
        } else {
            System.out.println("Amžius įvestas klaidingai. ");
            return 0;
        }

    }



}

