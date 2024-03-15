package day5.string;
import java.util.StringJoiner;

public class StringJoinerDemo {

	

	public static void main(String[] args) {
		 StringJoiner sj = new StringJoiner("-");   //added in java
	        sj.add("ankit");
	        sj.add("ankit");
	        sj.add("ankit");
	        sj.add("ankit");

	        System.out.println(sj);

	        StringJoiner fruits = new StringJoiner(" ", "[", "]"); // Delimiter, prefix, suffix
	        fruits.add("Mango");
	        fruits.add("Mango");
	        fruits.add("Mango");
	        fruits.add("Mango");
	        
	        System.out.println(fruits);

	}

}
