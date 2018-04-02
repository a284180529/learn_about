package pattern19_memento;

public class Memento implements IMemento {

	private String value;

	@Override
	public void setVaule(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}

}
