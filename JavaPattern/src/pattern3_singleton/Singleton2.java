package pattern3_singleton;

public class Singleton2 {
	
	// 懒汉模式  优点：使用才会初始化  缺点：线程不安全，如果加锁则效率低
	
	private static Singleton2 instance;
	
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
	// 考虑线程安全问题，方法加锁
	public static synchronized Singleton2 getInstance1() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
