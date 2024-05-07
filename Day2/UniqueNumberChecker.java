import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer: ");
        int number;
            number = scanner.nextInt();

        // Check if the number is unique
        if (isUniqueNumber(number)) {
            System.out.println(number + " is a unique number.");
        } else {
            System.out.println(number + " is not a unique number.");
        }

        // Close the Scanner
        scanner.close();
    }

    private static boolean isUniqueNumber(int num) {
        // Convert the number to a string to check for duplicate digits
        String numString = String.valueOf(num);

        // Use a set to keep track of seen digits
        Set<Character> seenDigits = new HashSet<>();

        for (char digit : numString.toCharArray()) {
            // If the digit is already in the set, the number is not unique
            if (!seenDigits.add(digit)) {
                return false;
            }
        }

        // If no duplicate digits are found, the number is unique
        return true;
    }
}
