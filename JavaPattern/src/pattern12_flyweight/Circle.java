package pattern12_flyweight;

public class Circle implements Shape {
	
	private String color;
	private int centerX;
	private int centerY;

	public Circle(String color) {
		this.color = color;
	}
	
	public void setCenter(int x, int y) {
		this.centerX = x;
		this.centerY = y;
	}

	@Override
	public void draw() {
		System.out.println(this + " --> " + toStringrrr());
	}

	private String toStringrrr() {
		return "Circle [color=" + color + ", centerX=" + centerX + ", centerY="
				+ centerY + "]";
	}
	
	

}
