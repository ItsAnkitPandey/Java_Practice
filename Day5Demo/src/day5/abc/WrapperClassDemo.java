package day5.abc;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i= 10;
		
		Integer a = new Integer(i); //converts int premetive to object - called boxing
		
		int j = a.intValue(); //convert object to premetive
		
		Integer b = 10; //Auto boxing
		int k = b; // auto unboxing
		
		System.out.println(Integer.MAX_VALUE);
	}

}
