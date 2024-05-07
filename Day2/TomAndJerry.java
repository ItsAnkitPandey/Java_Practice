import java.util.Scanner;

public class TomAndJerry {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer number: ");
        int number;
        
            number = scanner.nextInt();
      

        // Check conditions and print result
        if (number >= 20 && number <= 30) {
            if (number % 2 == 1) {
                System.out.println("Tom");
            } else {
                System.out.println("Jerry");
            }
        } else {
            System.out.println("Number is outside the range of 20 to 30.");
        }

        // Close the Scanner
        scanner.close();
    }
}
