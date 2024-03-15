package day5.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("main starts");
		
		Scanner sc = new Scanner(System.in);
				
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			
			System.out.println("result: "+ c);
		}
		catch(ArithmeticException e) {
			System.out.println("Dividor cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("PLease type correct values");
		}
		System.out.println("main ends");
		sc.close();
		
	}

}
