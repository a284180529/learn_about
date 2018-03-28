package pattern6_adapter.type1;

import pattern6_adapter.Source;
import pattern6_adapter.ITargetable;

public class Adapter extends Source implements ITargetable {

	@Override
	public void method2() {
		System.out.println("this is adapter method2");
	}

}
