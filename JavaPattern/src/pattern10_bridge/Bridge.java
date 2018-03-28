package pattern10_bridge;

public abstract class Bridge {
	
	private ISource mSource;

	public ISource getSource() {
		return mSource;
	}

	public void setSource(ISource source) {
		this.mSource = source;
	}
	
	public abstract void method();	
	
}
