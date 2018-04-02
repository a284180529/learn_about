package pattern14_template_method;

public class Test {
	
	// 模板方法模式：在抽象类中定义一个模板结构，将某些具体实现放在子类中实现
	
	public static void main(String[] args) {
		AbstractFather operation = new Subclass1();
		operation.operation();
		System.out.println();
		operation = new Subclass2();
		operation.operation();
	}

}
