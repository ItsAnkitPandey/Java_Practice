package synchronization;

public class SThread extends Thread {
	private MyResource myResource;
	
	SThread(MyResource myResource){
		this.myResource = myResource;
	}
	
	@Override
	public void run() {
		myResource.display();
	}

}
