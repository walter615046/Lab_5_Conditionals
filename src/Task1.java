import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        double totalPrice = 0;
        double SALES_TAX = .02;
        double itemPrice = 0;

        //Receive input
        System.out.print("Enter the price of your item: ");
        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
            totalPrice = itemPrice + itemPrice * SALES_TAX;
        } else {
            System.out.println("Error, invalid input");
            System.exit(0);
        }
        //Check price
        if (itemPrice >= 100) {
            System.out.print("Your shipping cost is free. The total cost of your item is $ " + itemPrice + ".");
        } else if (itemPrice < 100) {
            System.out.println("Your shipping cost is $ " + itemPrice * SALES_TAX + " and your total price is $ " + totalPrice);
            
        }
    }
}

