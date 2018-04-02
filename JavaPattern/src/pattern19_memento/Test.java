package pattern19_memento;

public class Test {
	
	// 备忘录模式：保存一个对象的某个状态，在需要的时候恢复
	
	public static void main(String[] args) {
		Original original = new Original("original");
		IMemento memento = new Memento();
		original.save(memento);
		Storage storage = new Storage(memento);
		
		System.out.println(original);
		original.setValue("change");
		System.out.println(original);
		original.restore(storage.getMemento());
		System.out.println(original);
		
	}

}
