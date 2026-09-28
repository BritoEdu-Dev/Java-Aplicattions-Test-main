import java.time.OffsetDateTime;
import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Switch Case Day of the Week \n");

        System.out.println("Please, enter your name: \n");
        var name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome.\n");

        int day = OffsetDateTime.now().getDayOfWeek().getValue();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println(name + ", today is: " + dayName);

        scanner.close();
    }
}
