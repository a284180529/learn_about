package pattern19_memento;

public class Original {
	
	private String value;
	
	public Original(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void save(IMemento memento) {
		memento.setVaule(value);
	}
	
	public void restore(IMemento memento) {
		setValue(memento.getValue());
	}

	@Override
	public String toString() {
		return "Original [value=" + value + "]";
	}

}
