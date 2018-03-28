package pattern1_factory.type1;

import pattern1_factory.EmailSender;
import pattern1_factory.ISender;
import pattern1_factory.SmsSender;

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
