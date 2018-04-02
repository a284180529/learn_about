package pattern16_iterator;

public class Test {
	
	// 迭代器模式：顺序访问聚集中的对象
	
	public static void main(String[] args) {
		ICollection<Object> collection = new MyCollection<Object>();
		Iterator<Object> iterator = collection.getIterator();
		
		collection.add("555555");
		collection.add(42342);
		collection.add("gwege");
		collection.add(false);
		
		while (iterator.isHasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		while (iterator.isHasPrev()) {
			System.out.println(iterator.prev());
		}
	}

}
