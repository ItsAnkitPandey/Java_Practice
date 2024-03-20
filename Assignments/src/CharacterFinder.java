import java.util.Scanner;

public class CharacterFinder {
	
	public char characterLocator(String inputString, String positionString) {
		try {
			int position = Integer.parseInt(positionString);
			return inputString.charAt(position);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds exception");
		}
		return '\0' ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter postion of character you want");
		String position = sc.nextLine();
		CharacterFinder charLocator = new CharacterFinder();
		System.out.println("character at index "+ position + " : " + charLocator.characterLocator(str, position));
		sc.close();
		

	}

}
