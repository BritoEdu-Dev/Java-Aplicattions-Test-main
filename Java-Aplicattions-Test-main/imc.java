import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculate Body Mass Index (BMI)");

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.println("\nYour BMI is: " + imc + "\nYou are underweight.");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.println("\nYour BMI is: " + imc + "\nYou have a normal weight.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("\nYour BMI is: " + imc + "\nYou are slightly overweight.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("\nYour BMI is: " + imc + "\nYou have obesity grade I.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("\nYour BMI is: " + imc + "\nYou have obesity grade II.");
        } else {
            System.out.println("\nYour BMI is: " + imc + "\nYou have obesity grade III.");
        }

        scanner.close();
    }
}
