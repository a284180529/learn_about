package pattern1_factory.type3;

import pattern1_factory.EmailSender;
import pattern1_factory.ISender;
import pattern1_factory.SmsSender;

public class SenderFactoryStatic {
	
	// 静态工厂

	public static ISender getSmsSender() {
		return new SmsSender();
	}
	
	public static ISender getEmailSender() {
		return new EmailSender();
	}
	
}
