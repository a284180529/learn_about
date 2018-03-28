package pattern01_factory;


public class SmsSender implements ISender {

	@Override
	public void send(String message) {
		System.out.println("SmsSender --> " + message);
	}

}
