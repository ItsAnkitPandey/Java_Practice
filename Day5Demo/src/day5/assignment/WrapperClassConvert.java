package day5.assignment;
import java.util.Scanner;

public class WrapperClassConvert {
    
    public Object convertToWrapper(Object input) {
        if (input == null || !(input instanceof Number || input instanceof Character || input instanceof Boolean)) {
            return "Give proper primitive type as input";
        }

        if (input instanceof Integer) {
            return Integer.valueOf((int) input);
        } else if (input instanceof Double) {
            return Double.valueOf((double) input);
        } else if (input instanceof Float) {
            return Float.valueOf((float) input);
        } else if (input instanceof Long) {
            return Long.valueOf((long) input);
        } else if (input instanceof Short) {
            return Short.valueOf((short) input);
        } else if (input instanceof Byte) {
            return Byte.valueOf((byte) input);
        } else if (input instanceof Character) {
            return Character.valueOf((char) input);
        } else if (input instanceof Boolean) {
            return Boolean.valueOf((boolean) input);
        }

        return "Give proper primitive type as input";
    }

    public static void main(String[] args) {
        WrapperClassConvert converter = new WrapperClassConvert();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a primitive value: ");
        String userInput = scanner.nextLine();
        scanner.close();
        
        Object result;
        try {
            if (userInput.matches("-?\\d+")) {
                result = Integer.parseInt(userInput);
            } else if (userInput.matches("-?\\d*\\.\\d+")) {
                result = Double.parseDouble(userInput);
            } else if (userInput.matches("-?\\d*\\.\\d+[fF]")) {
                result = Float.parseFloat(userInput);
            } else if (userInput.matches("-?\\d+[lL]")) {
                result = Long.parseLong(userInput);
            } else if (userInput.matches("-?\\d+[sS]")) {
                result = Short.parseShort(userInput);
            } else if (userInput.matches("-?\\d+[bB]")) {
                result = Byte.parseByte(userInput);
            } else if (userInput.length() == 1) {
                result = userInput.charAt(0);
            } else if (userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) {
                result = Boolean.parseBoolean(userInput);
            } else {
                result = "Give proper primitive type as input";
            }
        } catch (NumberFormatException e) {
            result = "Give proper primitive type as input";
        }

        Object convertedResult = converter.convertToWrapper(result);
        System.out.println(convertedResult);
    }
}
