package pattern17_chain_of_responsibility;

public class Handler1 extends AbstractHanlder{

	public Handler1(int level) {
		super(level);
	}

	@Override
	protected void concreteHandler(Request request) {
		
	}

}
