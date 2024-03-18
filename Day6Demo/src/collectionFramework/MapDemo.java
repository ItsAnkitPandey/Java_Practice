package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> capitalsMap = new HashMap<>();
		capitalsMap.put("India", "New Delhi");
		capitalsMap.put("UK", "London");
		capitalsMap.put("Russia", "Moscow");
		capitalsMap.put("France", "Peris");
		
		System.out.println(capitalsMap);
		
	
		
		LinkedHashMap<String, String> capitalsMap2 = new LinkedHashMap<>();
		capitalsMap2.put("India", "New Delhi");
		capitalsMap2.put("UK", "London");
		capitalsMap2.put("Russia", "Moscow");
		capitalsMap2.put("France", "Peris");
		
		System.out.println(capitalsMap2);

	}

}
