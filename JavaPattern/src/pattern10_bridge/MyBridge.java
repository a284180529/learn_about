package pattern10_bridge;

public class MyBridge extends Bridge {

	@Override
	public void method() {
		getSource().method();
	}

}
