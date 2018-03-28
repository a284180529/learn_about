package pattern02_factory_abstract;

import pattern01_factory.ISender;
import pattern01_factory.SmsSender;

public class SmsFactory implements IFactory {

	@Override
	public ISender getSender() {
		return new SmsSender();
	}

}
