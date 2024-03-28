package designPattern;

public class A {
	public static A a1 = new A();
	
	private A(){
		
	}
	
	static public A getInstance() {
		return a1;
	}
	

}
