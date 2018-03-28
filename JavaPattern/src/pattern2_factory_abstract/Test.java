package pattern2_factory_abstract;

public class Test {

	public static void main(String[] args) {
		
		IFactory factory = new SmsFactory();
		factory.getSender().send("sms message");
		
		factory = new EmailFactory();
		factory.getSender().send("email message");
	}
	
}
