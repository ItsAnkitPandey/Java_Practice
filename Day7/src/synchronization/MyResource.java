package synchronization;

import java.util.ArrayList;
import java.util.List;

public class MyResource {
	private List<String> courses;
	
	MyResource(){
		courses = new ArrayList<>();
		courses.add("sql");
		courses.add("html");
		courses.add("css");
		courses.add("js");
		courses.add("java");
		courses.add("react");
	}
	
	synchronized void display() {
		courses.forEach(p->System.out.println(Thread.currentThread().getName() + p));
	}
}
