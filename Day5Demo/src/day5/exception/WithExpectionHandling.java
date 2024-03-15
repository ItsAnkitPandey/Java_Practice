package day5.exception;

public class WithExpectionHandling {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			int a = 10;
			int b = 6;
			int c = a/b;
			
			System.out.println("Result: "+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("divider cannot be zero");
		}
	
		System.out.println("Main ends");

	}

}
