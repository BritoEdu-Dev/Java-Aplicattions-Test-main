import java.time.OffsetDateTime;
import java.util.Scanner;

/**
 * Age Calculator application.
 * This program:
 * 1. Requests user's name and birth date (day, month, year)
 * 2. Compares with the current date (hardcoded as 11/01/2026)
 * 3. Calculates the current age, considering if birthday has already occurred this year
 * 4. Displays the user's information and current age
 */
public class BirthsAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Age Calculator \n");

        System.out.println("\nPlease, enter your name: \n");
        var name = scanner.nextLine();

        System.out.println("\nWhat is your birth day?: \n");
        var birthDay = scanner.nextLine();

        System.out.println("\nWhat is your birth month?: \n");
        var birthMonth = scanner.nextLine();

        System.out.print("\nWhat is your birth year?: \n");
        var birthYear = Integer.parseInt(scanner.nextLine());

        var currentDay = OffsetDateTime.now().getDayOfMonth();
        var currentMonth = OffsetDateTime.now().getMonthValue();
        var currentYear = OffsetDateTime.now().getYear();
        
        int bDay = Integer.parseInt(birthDay);
        int bMonth = Integer.parseInt(birthMonth);
        
        int age = currentYear - birthYear;
        
        if (currentMonth < bMonth || (currentMonth == bMonth && currentDay < bDay)) {
            age--;
        }

        System.out.println("\nHello, " + name + "! You were born in " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("\nYou are " + age + " years old!");
        System.out.println("\nToday is " + currentDay + "/" + currentMonth + "/" + currentYear);

        scanner.close();
    }
}
