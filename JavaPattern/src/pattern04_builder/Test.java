package pattern04_builder;

public class Test {
	
	// 将一个复杂对象的构建和表示相分离，使相同的构建过程可以创建不同的表示
	
	public static void main(String[] args) {
		
		IBuilder builder = new ConcreteBuilder();
		Director director = new Director();
		
		Computer computer = director.Construct(builder);
		
		computer.show();
	}

}
