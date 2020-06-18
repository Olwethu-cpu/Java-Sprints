import java.util.Scanner;

public class sprint3{
    public static void main(String[] args) {
        
        System.out.println("Please enter the amount of rows you want to be printed out.");

        Scanner answer = new Scanner(System.in);
        int input = answer.nextInt();
        System.out.println();
        String output = "";

        for (int i = 0; i < input; i++) {
            output = output + "*";
            System.out.println(output);
        }
        answer.close();
    }
}