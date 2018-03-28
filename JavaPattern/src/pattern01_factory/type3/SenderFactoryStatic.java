package pattern01_factory.type3;

import pattern01_factory.EmailSender;
import pattern01_factory.ISender;
import pattern01_factory.SmsSender;

public class SenderFactoryStatic {
	
	// 静态工厂

	public static ISender getSmsSender() {
		return new SmsSender();
	}
	
	public static ISender getEmailSender() {
		return new EmailSender();
	}
	
}
