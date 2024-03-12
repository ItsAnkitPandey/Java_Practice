import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.print("Enter integers separated by spaces (press Enter to finish): ");
            scanner.nextLine();
            int sum = readAndSumIntegers();
             
            System.out.println("Total sum: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Error: Non-integer value detected. Please enter only integer values.");
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }

    private static int readAndSumIntegers(Scanner scanner) {
        int sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                // Skip non-integer values
                scanner.next();
            }
        }

        return sum;
    }
}
