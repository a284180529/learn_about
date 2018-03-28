package pattern3_singleton;

public class Singleton4 {
	
	// 静态内部类   同时保证延时加载和线程安全
	
	private Singleton4() {
		
	}
	
	private static class Inner {
		
		private static Singleton4 instance = new Singleton4();
		
	}
	
	public static Singleton4 getInstance() {
		return Inner.instance;
	}

}
