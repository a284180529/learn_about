package pattern17_chain_of_responsibility;

import java.util.Random;

public class Test {
	
	// 责任链模式：多个对象，每个对象持有下一个对象，请求在形成的链路上传递，直到某一对象处理该请求，该过程对请求者透明
	
	private static int[] levels = {1, 2, 3};
	
	public static void main(String[] args) {
		AbstractHanlder hanlder1 = new Handler1(1);
		AbstractHanlder hanlder2 = new Handler1(2);
		AbstractHanlder hanlder3 = new Handler1(3);
		
		hanlder1.setNextHandler(hanlder2);
		hanlder2.setNextHandler(hanlder3);
		
		for (int i = 0; i < 10; i++) {
			hanlder1.handlerRequest(new Request(levels[getRandom() % 3]));
		}
	}

	private static int getRandom() {
		return new Random().nextInt(100);
	}

}
