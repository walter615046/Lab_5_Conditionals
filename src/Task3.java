import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        String yourParty;
        String menu = "Choose Party Affiliation: D - Democrat\t R - Republican \t I - Independent  ";
        System.out.println(menu);
        yourParty= scan.nextLine();
        yourParty= yourParty.toUpperCase();

        //Find out what Party
        if (yourParty.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (yourParty.equals("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (yourParty.equals("I")) {
            System.out.println("You are an Independent Person");
        }else
            System.out.println("Error: Invalid Input");
            System.exit(0);

        }
    }


