import java.util.Scanner; // Adding Scanner library

public class PurchasePrice07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int price, quantity;// Declare the price and amount variables as integere
        double discountRate = 0.1, total, payment, discountAmount; // Declare the variables discount, total, pay, and discount amount as double

        System.out.print("Enter the item price: ");
        price = input.nextInt(); // Inputting the price

        System.out.print("Enter the quantity of items purchased: ");
        quantity = input.nextInt(); // Inputting the amount

        total = price * quantity; // Calculating the shopping total
        discountAmount = total * discountRate; // Calculating the discount amount
        payment = total - discountAmount; // Calculating the amount to pay

        System.out.println("The discount you received is: " + discountAmount);
        System.out.println("The total payment is: " + payment);

        input.close(); // Closes the Scanner object
    }
}
