package pattern16_iterator;

public interface Iterator<T> {
	
	boolean isHasNext();
	
	T next();
	
	boolean isHasPrev();	
	
	T prev();

}
