import java.util.Scanner;

public class sprint3{
    public static void main(String[] args) {
        
        System.out.println("Please enter the amount of rows that you want printed out.");

        Scanner answer = new Scanner(System.in);
        int input = answer.nextInt();

        //if the user enters (input <= 0), the program will stop

        if (input < 1) {
            System.out.println("Invalid input. Program has been terminated.");
            System.exit(0);
        }

        System.out.println();
        String output = "";

        //for each iteration, an additional star is added to the output and the printed out

        for (int i = 0; i < input; i++) {
            output = output + "*";
            System.out.println(output);
        }
        answer.close();
    }
}