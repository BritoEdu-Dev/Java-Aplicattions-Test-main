import java.util.Scanner;

/**
 * Rectangle Properties Calculator application.
 * This program:
 * 1. Requests user's name
 * 2. Asks for the base (width) and height of the rectangle
 * 3. Calculates the area: base × height
 * 4. Calculates the perimeter: 2 × (base + height)
 * 5. Displays the rectangle's area and perimeter
 */
public class calculateObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Rectangle Properties Calculator \n");

        System.out.println("Please, enter your name: \n");
        var name = scanner.nextLine();

        System.out.println("Enter your preference of media (cm, m, etc.): \n");
        var media = scanner.nextLine();

        System.out.print("Enter the base to calculate your rectangle: \n");
        var base = scanner.nextLine();

        System.out.println("Enter the height of your rectangle: \n");
        var height = scanner.nextLine();

        var area = Integer.parseInt(base) * Integer.parseInt(height);
        var perimeter = 2 * (Integer.parseInt(base) + Integer.parseInt(height));

        System.out.println("Hello, " + name + ", your rectangle have this size " + area + "" + media +"²" +" and your perimeter is " + perimeter + " " + media + "!");
        
        scanner.close();
    }
}
