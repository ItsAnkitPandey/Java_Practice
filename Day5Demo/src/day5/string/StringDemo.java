package day5.string;

public class StringDemo {

	public static void main(String[] args) {
		  String st = new String("Hello");   //immutable(can't modify)
	        st.concat("java");

	         System.out.println(st);

	         StringBuffer sb = new StringBuffer("Hello"); //mutable
	         sb.append("java");

	         System.out.println(sb);

	}

}
