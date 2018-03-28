package pattern01_factory;

import pattern01_factory.type1.SenderFactory;
import pattern01_factory.type2.SenderFactoryMethod;
import pattern01_factory.type3.SenderFactoryStatic;

public class Test {
	public static void main(String[] args) {
		testFactoryType1();
		System.out.println();
		testFactoryType2();
		System.out.println();
		testFactoryType3();
	}

	// 静态工厂
	private static void testFactoryType3() {
		SenderFactoryStatic.getEmailSender().send("email message");
		SenderFactoryStatic.getSmsSender().send("sms message");
	}

	// 工厂方法
	private static void testFactoryType2() {
		SenderFactoryMethod factoryMethod = new SenderFactoryMethod();
		factoryMethod.getSmsSender().send("sms message");
		factoryMethod.getEmailSender().send("email message");
	}

	// 普通工厂
	private static void testFactoryType1() {
		ISender sender = new SenderFactory().getSender("sms");
		sender.send("lllllfefefeo");
	}
}
