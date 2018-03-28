package pattern10_bridge;

public class Test {

	// 桥接模式：将抽象与实现解耦，使得两者可以独立变化
	
	public static void main(String[] args) {
		
		ISource source = new Source1();
		Bridge bridge = new MyBridge();
		bridge.setSource(source);
		bridge.method();
		
		source = new Source2();
		bridge.setSource(source);
		bridge.method();
		
	}
}
