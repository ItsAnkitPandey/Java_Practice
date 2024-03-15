package day5.exception;

public class WithoutExceptionHandling {

	public static void main(String[] args) {
		System.out.println("main starts");
		int a = 10;
		int b = 0;
		int c = a/b;
		
		System.out.println("Result: "+c);
		
		System.out.println("Main ends");

	}

}
