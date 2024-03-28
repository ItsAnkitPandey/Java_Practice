package designPattern;

public class PolygonFactory {
	static public Polygon getInstance(int numOfSides) {
		if(numOfSides == 3) {
			return new Triangle();
		}
		if(numOfSides == 4) {
			return new Square();
		}
		if(numOfSides == 5) {
			return new Pentagon();
		}
		return null;
	}

}
