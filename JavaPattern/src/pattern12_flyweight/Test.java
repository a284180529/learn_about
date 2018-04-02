package pattern12_flyweight;

import java.util.Random;

public class Test {
	
	// 享元模式：采用共享方式来避免大量拥有相同内容对象的开销
	
	private static String[] colors = {"green", "red", "blue", "black", "white"};

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = ShapeFactory.getCircle(colors[getRadom() % 5]);
			circle.setCenter(getRadom(), getRadom());
			circle.draw();
		}
	}

	private static int getRadom() {
		return new Random().nextInt(500);
	}
	
}
