import java.util.Scanner;

public class PurchasePrice072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, quantity, pageCount;
        double discountRate, total, payment, discountAmount;
        String bookBrand;

        System.out.print("Enter the item price: ");
        price = input.nextInt();

        System.out.print("Enter the quantity of items purchased: ");
        quantity = input.nextInt();

        input.nextLine(); // Consume the newline character

        System.out.print("Enter the book brand: ");
        bookBrand = input.nextLine();

        System.out.print("Enter the page count: ");
        pageCount = input.nextInt();

        System.out.print("Enter the discount rate (in decimal form, e.g., 0.1 for 10%): ");
        discountRate = input.nextDouble();

        total = price * quantity;
        discountAmount = total * discountRate;
        payment = total - discountAmount;

        System.out.println("Item: " + bookBrand);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Total Payment: " + payment);

        input.close();
    }
}
