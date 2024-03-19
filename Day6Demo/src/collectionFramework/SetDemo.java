package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> courses = new HashSet<>();  
		
		courses.add("sql");
		courses.add("html");
		courses.add("css");
		courses.add("css");
		courses.add("java");
		courses.add("js");
		
		System.out.println(courses);
		
		LinkedHashSet<String> course = new LinkedHashSet<String>();  //sorted in insertion order
		course.add("sql");
		course.add("html");
		course.add("css");
		course.add("css");
		course.add("java");
		course.add("js");
		
		System.out.println(course);
		
		TreeSet<String> course1 = new TreeSet<String>();   // sorted in alphabetically order
		course1.add("sql");
		course1.add("html");
		course1.add("css");
		course1.add("css");
		course1.add("java");
		course1.add("js");
		
		System.out.println(course1);
		
	}

}
