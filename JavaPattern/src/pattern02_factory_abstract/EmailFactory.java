package pattern02_factory_abstract;

import pattern01_factory.EmailSender;
import pattern01_factory.ISender;

public class EmailFactory implements IFactory {

	@Override
	public ISender getSender() {
		return new EmailSender();
	}

}
