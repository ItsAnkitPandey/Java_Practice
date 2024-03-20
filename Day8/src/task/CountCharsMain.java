package task;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharsMain {
	public static Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		for(char c: arr) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		return charCount;
	}

	public static void main(String[] args) {
		char [] arr  = {'h','e','l','l','o','o'};
		Map<Character, Integer> result = countChars(arr);
		System.out.println(result);
	}

}
