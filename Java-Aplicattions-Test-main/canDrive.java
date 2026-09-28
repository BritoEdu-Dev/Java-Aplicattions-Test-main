import java.util.Scanner;

public class canDrive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        var name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Are you emancipated? (yes/no): ");
        var isEmancipated = scanner.next(). equalsIgnoreCase("yes");

        if (age >= 18) {
            System.out.printf("Hello, %s! \n", name);
            System.out.printf("You are an adult!, you can drive! \n", name, age);
        } 

        else if (age >= 16 && isEmancipated) {
            System.out.printf("Hello, %s! \n", name);
            System.out.printf("You are a minor, but emancipated, you can drive! \n", name, age);
        } 

        else {
            System.out.printf("Hello, %s! \n", name);
            System.out.printf("You are a minor!, you cannot drive!", name);
        }
        
        scanner.close();
    }
}
