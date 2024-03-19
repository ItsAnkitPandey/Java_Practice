package thread;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		System.out.println("Main Starts");
		
		Thread t1 = new Thread(myRunnable,"mt");
		t1.start();
		System.out.println(t1);

}
}
