package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> scores= new ArrayList<>();
		
		scores.add(10);
		scores.add(50);
		scores.add(30);
		scores.add(54);
		System.out.println(scores);
		
		for(Integer i:scores) {
			Integer str = (Integer) i;
			System.out.println(str);
		}
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("ankit");
		names.add("sohan");
		names.add("satya");
		names.add("nakul");
		
		System.out.println(names);
		
		Iterator<String> i = names.iterator();
		
		while(i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
	}

}
