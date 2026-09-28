import java.util.Scanner;

/**
 * Age Difference Calculator application.
 * This program:
 * 1. Requests user's name
 * 2. Asks if the user wants to know the age difference between mother and grandmother
 * 3. If yes: collects both ages and calculates the difference
 * 4. If no: displays a farewell message
 * 5. Displays the result or exits gracefully
 */
public class differentAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Age Difference Calculator \n");
        
        System.out.println("Please, enter your name: ");
        var name = scanner.nextLine();

        System.out.println("Do you want to know the difference between your mother and your grandmother?: ");
        var answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Enter your mother's age: ");
            var motherAge = scanner.nextLine();

            System.out.println("Enter your grandmother's age: ");
            var grandmotherAge = scanner.nextLine();
            var difference = Integer.parseInt(grandmotherAge) - Integer.parseInt(motherAge);

            System.out.println("Hello, " + name + ", the difference between your mother and your grandmother is " + difference + " years!");

        } else {
            System.out.println("Okay, " + name + ", have a nice day!");
        } 
        scanner.close();
    }   
}