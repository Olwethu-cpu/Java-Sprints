import java.util.Scanner;

public class sprint3 {

    public static void main(String[] args) {
        System.out.println("Please enter a star.");
        
        Scanner scanIt = new Scanner(System.in);

        String input = scanIt.nextLine();

        if (input.equals("*")) {
            //System.out.println(starOut(input));
            //System.out.println( starOut(input) );

            for (int i = 0; i < 20; i++) {
                
                
                
                System.out.println(input);
            }

        } else {
            System.out.println("Invalid input. Please try again.");
        }

        scanIt.close();
    }


    /*public static String starOut(String str) {
        if (str.length() < 20) {
            System.out.println(str);
            return str + starOut(str + str);
        } else {
            return str;
        }
    }*/

}
