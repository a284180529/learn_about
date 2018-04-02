package pattern16_iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> implements ICollection<T>{
	
	private List<T> collectionList = new ArrayList<T>();

	@Override
	public void add(T t) {
		collectionList.add(t);
	}

	@Override
	public void remove(T t) {
		collectionList.remove(t);
	}

	@Override
	public Iterator<T> getIterator() {
		return new MyIterator<T>(this);
	}

	@Override
	public int size() {
		return collectionList.size();
	}

	@Override
	public T get(int index) {
		return collectionList.get(index);
	}

}
