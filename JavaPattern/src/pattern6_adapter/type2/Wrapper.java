package pattern6_adapter.type2;

import pattern6_adapter.ITargetable;
import pattern6_adapter.Source;

public class Wrapper implements ITargetable {
	
	private Source mSource;

	public Wrapper(Source source) {
		this.mSource = source;
	}

	@Override
	public void method1() {
		mSource.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is Wrapper method2");
	}

}
