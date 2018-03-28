package pattern06_adapter;

import pattern06_adapter.type1.Adapter;
import pattern06_adapter.type2.Wrapper;
import pattern06_adapter.type3.Adapter1;
import pattern06_adapter.type3.Adapter2;

public class Test {
	
	// 将某个类的接口转换成客户端期望的另一个接口表示
	
	public static void main(String[] args) {
		test1();
		System.out.println();
		test2();
		System.out.println();
		test3();
	}

	private static void test3() {
		ITargetable targetable = new Adapter1();
		targetable.method1();
		targetable.method2();
		targetable = new Adapter2();
		targetable.method1();
		targetable.method2();
	}

	private static void test2() {
		Source source = new Source();
		ITargetable targetable = new Wrapper(source);
		targetable.method1();
		targetable.method2();
	}

	private static void test1() {
		ITargetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
	}

}
