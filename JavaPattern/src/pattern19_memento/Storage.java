package pattern19_memento;

public class Storage {
	
	private IMemento memento;
	
	public Storage(IMemento memento) {
		this.memento = memento;
	}

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}

}
