package pattern03_singleton;


public class Singleton1 {
	
	//  饿汉模式  优点：线程安全，只会初始化一次  缺点：长驻内存，不使用也加载
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}


}
