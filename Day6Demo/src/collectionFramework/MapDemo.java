package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
		
		TreeMap<Integer, String> products = new TreeMap<>();
		products.put(01, "Apple");
		products.put(05, "Samsung");
		products.put(04, "BlackBerry");
		products.put(03, "Xiomi");
		products.put(02, "Oppo");
		
		System.out.println(products);

	}

}
