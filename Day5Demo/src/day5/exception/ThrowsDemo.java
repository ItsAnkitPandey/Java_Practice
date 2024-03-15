package day5.exception;

public class ThrowsDemo {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		ThrowsDemo td = new ThrowsDemo();
		try {
		
		int result = td.division(5, 0);
		System.out.println("result "+result);
		
		} 
		catch(ArithmeticException e) {
			System.out.println("Dividor cannot be zero");
		}
		System.out.println("Main Starts");
		
		
	}
	
	int division(int a, int b) throws ArithmeticException{
		int c = a/b ;
		return c;
	}

}
