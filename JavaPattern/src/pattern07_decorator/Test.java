package pattern07_decorator;

public class Test {

	// 动态给一个对象增加某些新的功能，要求装饰对象和被装饰对象实现同一个个接口，装饰对象持有被装饰对象的实例
	
	public static void main(String[] args) {
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
