package pattern2_factory_abstract;

import pattern1_factory.ISender;
import pattern1_factory.SmsSender;

public class SmsFactory implements IFactory {

	@Override
	public ISender getSender() {
		return new SmsSender();
	}

}
