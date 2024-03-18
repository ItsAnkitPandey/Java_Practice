package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<>();

		courses.add("sql");
		courses.add("html");
		courses.add("css");
		courses.add("css");
		courses.add("java");
		courses.add("js");
		
		System.out.println(courses);
		
		System.out.println("********Using Iterator**********");
		
		Iterator<String>  i = courses.iterator();
		
		while(i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}

		System.out.println("********Using enhanced for loop**********");
		
		for(String obj: courses) {
			String str = (String) obj;
			System.out.println(str);
		}
	}

}
