package pattern01_factory.type2;

import pattern01_factory.EmailSender;
import pattern01_factory.ISender;
import pattern01_factory.SmsSender;

public class SenderFactoryMethod {
	
	// 工厂方法
	
	public ISender getEmailSender() {
		return new EmailSender();
	}
	
	public ISender getSmsSender() {
		return new SmsSender();
	}

}
