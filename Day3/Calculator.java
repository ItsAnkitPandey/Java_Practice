import java.util.Scanner;

class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.runCalculator(scanner);
        scanner.close();
    }
    
    public void runCalculator(Scanner scanner) {
        System.out.println(getValues(scanner));
        System.out.println("Do you want to try again(y/n)");
        String continueOption = scanner.next();
        
        if (continueOption.equalsIgnoreCase("y")) {
            runCalculator(scanner);
        }
    }
    
    public String calculate(int firstValue, int secondValue, int operator) {
        double result = 0;
        String operation = "";
        
        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                operation = "+";
                break;
            case 2:
                result = firstValue - secondValue;
                operation = "-";
                break;
            case 3:
                result = firstValue * secondValue;
                operation = "*";
                break;
            case 4:
                if (secondValue != 0) {
                    result = (double)firstValue / secondValue;
                    operation = "/";
                } else {
                    return "The divider (secondValue) cannot be zero";
                }
                break;
            default:
                return "Entered wrong option " + operator;
        }
        
        return firstValue + " " + operation + " " + secondValue + " = " + result;
    }
    
    public String getValues(Scanner scanner) {
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        
        System.out.println("Enter number beside the operation to perform:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int operation = scanner.nextInt();
        
        return calculate(firstNumber, secondNumber, operation);
    }
}
