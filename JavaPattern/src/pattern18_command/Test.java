package pattern18_command;

public class Test {
	
	// 命令模式：将请求以命令的形式包裹在对象中，传给调用对象
	
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		ICommand command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
