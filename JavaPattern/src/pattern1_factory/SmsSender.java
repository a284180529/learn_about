package pattern1_factory;


public class SmsSender implements ISender {

	@Override
	public void send(String message) {
		System.out.println("SmsSender --> " + message);
	}

}
