import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        int birthMonth = 0;

        //Input
        System.out.println("What is your birth month(number)?");

        if(scan.hasNextInt()){
            birthMonth= scan.nextInt();
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
            System.exit(0);
        }
        if (birthMonth > 12) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
            System.exit(0);
        } else if(birthMonth <1) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
            System.exit(0);
        } else {
            System.out.println(" Your birth month is " + birthMonth);
        }
    }
}
