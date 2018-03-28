package pattern3_singleton;

import java.lang.reflect.Constructor;

public enum Singleton5 {
	
	// 枚举  解决了以上方法的共同缺点：1、使用枚举可防止通过反射方式调用构造方法；2、使用枚举可防止反序列化是创建新对象（以实现序列化）
	
	INSTANCE;
	
	private Singleton5() {
		
	}
	
	public void method() {
		
	}
	
	public static void main(String[] args) {
//		testConstructor(Singleton4.class);
		testConstructor(Singleton5.class);
	}

	private static <T> void testConstructor(Class<T> classType) {
		try {
			Constructor<T> constructor = (Constructor<T>)classType.getDeclaredConstructor();
			constructor.setAccessible(true);
			T instance = constructor.newInstance();
			System.out.println(instance);
//			System.out.println(Singleton4.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
