package java8;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer[] num = {58,45,72,15,65,84,55,20,32,61,677,456};
		
		//Sum of all elements in array
		int sum = 0;
		
		for(int i=0; i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println("Sum: "+ sum);
		
		//Using StreamAPI
		int result = Arrays.stream(num).reduce((a,b) ->a+b ).get();
		System.out.println("Sum: "+ result);
		
		long count = Arrays.stream(num).filter(n-> n>=50).count();
		System.out.println("count: "+ count);
		

	}

}
