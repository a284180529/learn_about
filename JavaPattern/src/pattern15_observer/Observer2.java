package pattern15_observer;

public class Observer2 implements IObserver{

	@Override
	public void update() {
		System.out.println("Observer2 --> update");
	}

}
