package pattern01_factory.type1;

import pattern01_factory.EmailSender;
import pattern01_factory.ISender;
import pattern01_factory.SmsSender;

public class SenderFactory {
	
	// 普通工厂
	
	public ISender getSender(String sendType) {
		if ("sms".equals(sendType)) {
			return new SmsSender();
		} else {
			return new EmailSender();
		}
	}
}
