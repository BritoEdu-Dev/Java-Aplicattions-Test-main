import java.util.Scanner;

/**
 * Main menu application that displays 4 calculator options.
 * Users can choose to calculate:
 * 1. Their current age based on birth date
 * 2. Age difference between mother and grandmother
 * 3. Rectangle properties (area and perimeter)
 * 4. Square of a number
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the Multi-Calculator Application \n");
        System.out.println(" This application offers the following options: \n");
        System.out.println("Today is 12/01/2026\n");

        System.out.println("Choose an option:");
        System.out.println("1. Calculate Age");
        System.out.println("2. Calculate Age Difference");
        System.out.println("3. Calculate Rectangle Properties");
        System.out.println("4. Calculate Square");
        var choice = scanner.nextLine();

        switch (choice) {
            case "1":
                BirthsAge.main(args);
                break;
            case "2":
                differentAge.main(args);
                break;
            case "3":
                calculateObjects.main(args);
                break;
            case "4":
                calculateSquare.main(args);
                break;
            default:
                System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
        }
        scanner.close();
    }
}