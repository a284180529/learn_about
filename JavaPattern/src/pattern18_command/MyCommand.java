package pattern18_command;

public class MyCommand implements ICommand{
	
	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("MyCommand -- > execute");
		receiver.action();
	}

}
