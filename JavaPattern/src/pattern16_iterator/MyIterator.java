package pattern16_iterator;

public class MyIterator<T> implements Iterator<T> {
	
	private ICollection<T> collection;
	private int index = -1;

	public MyIterator(ICollection<T> collection) {
		this.collection = collection;
	}

	@Override
	public boolean isHasNext() {
		return index + 1 < collection.size();
	}

	@Override
	public T next() {
		if (index + 1 < collection.size()) {
			return collection.get(++index);
		} else {
			return null;
		}
	}

	@Override
	public boolean isHasPrev() {
		return index >= 0;
	}

	@Override
	public T prev() {
		if (index >= 0) {
			return collection.get(index--);
		} else {
			return null;
		}
	}

}
