package pattern06_adapter.type1;

import pattern06_adapter.ITargetable;
import pattern06_adapter.Source;

public class Adapter extends Source implements ITargetable {

	@Override
	public void method2() {
		System.out.println("this is adapter method2");
	}

}
