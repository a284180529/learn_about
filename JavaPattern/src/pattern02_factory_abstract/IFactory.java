package pattern02_factory_abstract;

import pattern01_factory.ISender;

public interface IFactory {
	
//	抽象工厂
	
	ISender getSender();

}
