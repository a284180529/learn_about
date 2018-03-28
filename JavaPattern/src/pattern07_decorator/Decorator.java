package pattern07_decorator;

public class Decorator implements IDecorator {
	
	private Source mSource;

	public Decorator(Source source) {
		this.mSource = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator");
		mSource.method();
		System.out.println("afrer decorator");
	}

}
