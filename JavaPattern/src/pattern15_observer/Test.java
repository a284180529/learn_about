package pattern15_observer;

public class Test {
	
	// 观察者模式：当一个对象发生变化，依赖于它的所有对象都会收到通知，并发生变化

	public static void main(String[] args) {
		ISubject subject = new MySubject();
		subject.register(new Observer1());
		subject.register(new Observer2());
		
		subject.operation();
	}
}
