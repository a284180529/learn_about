package pattern15_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements ISubject{
	
	private List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void register(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

}
