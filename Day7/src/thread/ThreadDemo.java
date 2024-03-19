package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		System.out.println("Main Starts");
		
		mt.start();
		mt.setName("T1");
		
		for(int j =51; j<=100; j++) {
			System.out.println(Thread.currentThread().getName()+ " "+ j);
	}
		
		System.out.println("Main Starts");
	}

}
