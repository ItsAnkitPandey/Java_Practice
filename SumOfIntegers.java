import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
             Scanner scanner = new Scanner(System.in);
   
            System.out.print("Enter integers separated by spaces (press Enter to finish): ");
            int sum = readAndSumIntegers(scanner);
            System.out.println("Total sum: " + sum);
       
            scanner.close();
        }
    

    public static int readAndSumIntegers(Scanner scanner) {
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

