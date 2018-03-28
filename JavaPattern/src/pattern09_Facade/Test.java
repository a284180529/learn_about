package pattern09_Facade;

public class Test {

	// 外观模式：为复杂的系统提供一个接口供客户端调用，从而隐藏系统的复杂性，解除客户端和系统内部的耦合关系
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		System.out.println();
		car.stop();
	}
	
}
