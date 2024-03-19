package synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		MyResource myResource = new MyResource();
		SThread sthread  = new SThread(myResource);
		
		sthread.setName("T01");
		sthread.start();
		
		SThread sthread2  = new SThread(myResource);
		
		sthread2.setName("T02");
		sthread2.start();

	}

}
