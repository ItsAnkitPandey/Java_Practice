package day5.string;

public class StringDemo3 {

	public static void main(String[] args) {
		 String st = "How are you";

	       char ch = st.charAt(5);
	       System.out.println(ch);

	       String sbstr = st.substring(4);
	       System.out.println(sbstr);

	       boolean isExists = st.contains("are");
	      System.out.println(isExists);

	}

}
