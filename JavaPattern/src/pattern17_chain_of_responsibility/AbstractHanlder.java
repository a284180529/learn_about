package pattern17_chain_of_responsibility;

public abstract class AbstractHanlder implements IHandler{
	
	private IHandler nextHandler;
	private int level;	
	
	public AbstractHanlder(int level) {
		this.level = level;
	}

	public IHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handlerRequest(Request request) {
		if (level == request.getLevel()) {
			System.out.println(this + "  handlerRequest --> " + request );
			concreteHandler(request);
		} else {
			getNextHandler().handlerRequest(request);
		}
	}
	
	protected abstract void concreteHandler(Request request);

}
