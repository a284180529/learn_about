package pattern17_chain_of_responsibility;

public class Request {
	
	private int level;
	
	public Request(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Request [level=" + level + "]";
	}
	

}
