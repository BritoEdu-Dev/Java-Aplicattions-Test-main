import java.util.Scanner;

/**
 * Square Calculator application.
 * This program:
 * 1. Requests user's name
 * 2. Asks for a number
 * 3. Calculates the square of that number (number × number)
 * 4. Displays the result formatted with 2 decimal places
 * 5. Shows a thank you message to the user
 */
public class calculateSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Square Calculator \n");

        System.out.print("Please, enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nHello, " + name + "! Welcome.\n");
        System.out.print("Enter a number to calculate its square: ");
        
        double number = scanner.nextDouble();
        double square = number * number;
        
        System.out.println("\n Result ");
        System.out.printf("The square of %.2f is: %.2f\n", number, square);
        System.out.println("\nThank you for using the program, " + name + "!");
        
        scanner.close();
    }
}