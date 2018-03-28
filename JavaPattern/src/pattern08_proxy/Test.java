package pattern08_proxy;

import pattern08_proxy.type1.ProxyStatic;
import pattern08_proxy.type2.ProxyFactoryDynamic;
import pattern08_proxy.type3.ProxyFactorySub;


public class Test {

	// 代理类对代理对象有控制权，决定是否执行，而装饰模式只为其增加一层装饰，以加强被装饰对象的功能
	// 提供了对目标对象的另外访问方式，通过代理对象访问目标对象
	
	public static void main(String[] args) {
		test1();
		System.out.println();
		test2();
		System.out.println();
		test3();
	}

	private static void test3() {
		Target target = new Target();
		ProxyFactorySub proxy = new ProxyFactorySub(target);
		Target pTarget = (Target) proxy.getProxyInstance();
		pTarget.method();
		pTarget.method1();
	}

	private static void test2() {
		Target target = new Target();
		ProxyFactoryDynamic proxyFactory = new ProxyFactoryDynamic(target);
		IProxy proxy = (IProxy) proxyFactory.getProxyInstance();
		proxy.method();
	}

	private static void test1() {
		Target target = new Target();
		IProxy proxy = new ProxyStatic(target);
		proxy.method();
	}
	
}
