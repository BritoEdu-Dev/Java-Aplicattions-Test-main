import java.util.Scanner;

public class verificationNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        var keepVerify = true;

        while (keepVerify) {
            
            System.out.println("Enter a number to verification: \n");

            var ToVerify = scanner.nextInt();

            if (ToVerify < number) {
                System.out.printf("Enter a number bigger than %s \n", number);
                continue;
            }

            var result = ToVerify % number;

            keepVerify = result == 0;

            System.out.printf("%s %% %s = %s \n", ToVerify, number, result);
        }
        scanner.close();
    }
}
