package pattern06_adapter.type3;

import pattern06_adapter.ITargetable;

public abstract class WrapperAbstract implements ITargetable{

	@Override
	public void method1() {
		System.out.println("this is WrapperAbstract method1");
	}
	
	@Override
	public void method2() {
		System.out.println("this is WrapperAbstract method2");		
	}
	
	
}
