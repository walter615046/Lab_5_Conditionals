import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        int yourAge = 0;

        //Collect input
        System.out.println("What is your age (in years)?");
        if (scan.hasNextInt()) {
            yourAge = scan.nextInt();}
        else {
            System.out.println("You entered an incorrect age value: " + yourAge);
            System.exit(0);
        }
        // See if they got a wristband
        if(yourAge >= 21){
            System.out.println("You get a wristband!");

        }
    }
}