package pattern09_Facade;

public class Car {
	
	private Door mDoor;
	private Key mKey;
	private Engine mEngine;

	public Car() {
		this.mDoor = new Door();
		this.mKey = new Key();
		this.mEngine = new Engine();
	}
	
	public void start() {
		mDoor.open();
		mKey.inset();
		mEngine.start();
	}
	
	public void stop() {
		mEngine.stop();
		mKey.pullOut();
		mDoor.close();
	}

}
