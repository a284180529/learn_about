package pattern15_observer;

public interface ISubject {
	
	void register(IObserver observer);
	
	void unregister(IObserver observer);
	
	void notifyObserver();
	
	void operation();

}
