package pattern16_iterator;


public interface ICollection<T> {
	
	void add(T t);
	
	void remove(T t);
	
	int size();
	
	T get(int index);
	
	Iterator<T> getIterator();


}
