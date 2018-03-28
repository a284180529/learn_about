package pattern03_singleton;

public class Singleton3 {
	
	// 双重校验锁
	
//	private static Singleton3 instance;	
	// 考虑JAVA的指令重排优化，可能初始化Singleton3的和将对象地方赋值给instance的执行顺序不确定，增加关键子volatile
	private volatile static Singleton3 instance;
	
	private Singleton3() {
		
	}
	
	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

}
