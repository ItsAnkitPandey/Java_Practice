import java.util.Scanner;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        RearrangeArrayElements rearrangeArrayElements = new RearrangeArrayElements();
        rearrangeArrayElements.inputAcceptor();
    }

    public void inputAcceptor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        if (inputArraySizeValidator(size)) {
            int[] inputArray = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                inputArray[i] = scanner.nextInt();
            }

            if (inputArrayValidator(inputArray)) {
                int[] result = computeRearrangedArray(inputArray);
                displayResult(result);
            } else {
                System.out.println("Give proper input");
            }
        } else {
            System.out.println("Give proper input");
        }

        scanner.close();
    }

    public boolean inputArraySizeValidator(int size) {
        return size > 0;
    }

    public boolean inputArrayValidator(int[] input) {
        if (input == null || input.length == 0) {
            return false;
        }
        for (int i = 1; i < input.length; i++) {
            if (input[i] < input[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] computeRearrangedArray(int[] inputArray) {
        int[] rearrangedArray = new int[inputArray.length];
        int left = 0, right = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                rearrangedArray[i] = inputArray[right--];
            } else {
                rearrangedArray[i] = inputArray[left++];
            }
        }
        return rearrangedArray;
    }

    public void displayResult(int[] outputArray) {
        if (outputArray == null) {
            System.out.println("Give proper input");
        } else {
            for (int i = 0; i < outputArray.length; i++) {
                System.out.print(outputArray[i] + " ");
            }
            System.out.println();
        }
    }
}
