import java.util.Scanner;

public class forest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Welcome to the Forest!");


        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        for (int i = 1; i <= 300; i++) {
            System.out.println("Tree " + i + ": 🌳");
        }

        System.out.println("Hello, " + name + "! The forest has 300 trees.");

        
        scanner.close();
        
    }
}
