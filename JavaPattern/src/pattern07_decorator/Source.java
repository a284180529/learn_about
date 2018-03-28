package pattern07_decorator;

public class Source implements IDecorator {

	@Override
	public void method() {
		System.out.println("this is source method");
	}

}
