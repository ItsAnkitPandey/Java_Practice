package thread;

public class JoinDemo {

	public static void main(String[] args) {
		System.out.println("Main Starts");

		MyThread mt = new MyThread();
		mt.setName("T01");
		mt.start();

		try {
			mt.join(); // main thread joins after completion of T1 thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int j = 51; j < 100; j++) {
			System.out.println(Thread.currentThread().getName() + " " + j);
		}
		System.out.println("Main ends");

	}

}
