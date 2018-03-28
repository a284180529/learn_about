package pattern2_factory_abstract;

import pattern1_factory.EmailSender;
import pattern1_factory.ISender;

public class EmailFactory implements IFactory {

	@Override
	public ISender getSender() {
		return new EmailSender();
	}

}
