package pattern18_command;

public class Invoker {
	
	private ICommand command;

	public Invoker(ICommand command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();		
	}

}
