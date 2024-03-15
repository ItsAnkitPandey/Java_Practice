package day5.exception;

public abstract class ThrowsDemo2 {

	public static void main(String[] args) {
		try {
			load();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void load() throws ClassNotFoundException {
		Class.forName("day5demo.hunggr.kork");
	}
}
