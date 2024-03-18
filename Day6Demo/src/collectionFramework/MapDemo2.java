package collectionFramework;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String, String> capitalsMap = new HashMap<>();
		capitalsMap.put("India", "New Delhi");
		capitalsMap.put("UK", "London");
		capitalsMap.put("Russia", "Moscow");
		capitalsMap.put("France", "Peris");
		
		System.out.println(capitalsMap);
		
		System.out.println("********** Keys ************");
		
		Set<String> keys = capitalsMap.keySet();
		System.out.println(keys);
		
		
	}

}
