package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {

	public static void main(String[] args) {
		List<String> courses = new ArrayList<>();

		courses.add("sql");
		courses.add("html");
		courses.add("css");
		courses.add("css");
		courses.add("java");
		courses.add("js");

		System.out.println("********Using Iterator**********");

		Iterator<String> i = courses.iterator();

		while (i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
		
		System.out.println("********Using Lambda **********");
		
		courses.forEach(c-> System.out.println(c));
	}

}
