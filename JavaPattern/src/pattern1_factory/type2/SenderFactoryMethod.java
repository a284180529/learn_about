package pattern1_factory.type2;

import pattern1_factory.EmailSender;
import pattern1_factory.ISender;
import pattern1_factory.SmsSender;

public class SenderFactoryMethod {
	
	// 工厂方法
	
	public ISender getEmailSender() {
		return new EmailSender();
	}
	
	public ISender getSmsSender() {
		return new SmsSender();
	}

}
