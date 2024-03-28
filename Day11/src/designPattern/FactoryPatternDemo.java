package designPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Polygon t = PolygonFactory.getInstance(4);
		System.out.println(t.getType());
	}

}
