package pattern12_flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
	
	public static Circle getCircle(String color) {
		Circle circle = (Circle) shapeMap.get(color);
		
		if (circle == null) {
			circle = new Circle(color);
			shapeMap.put(color, circle);
		}
		
		return circle;
		
	}
	
}
