package pattern08_proxy;

public class Target implements IProxy{

	@Override
	public void method() {
		System.out.println("this target method");
	}
	
	public void method1() {
		System.out.println("this target method1");
	}

}
