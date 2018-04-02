package pattern15_observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("MySubject --> operation");
		notifyObserver();
	}

}
