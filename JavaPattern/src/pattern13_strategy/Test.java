package pattern13_strategy;

public class Test {

	// 策略模式：封装一系列算法供用户端使用，不同的算法可相互替换
	
	public static void main(String[] args) throws Throwable {
		int x = 10, y = 2;
		Operation operation = new Operation();
		operation.setCalculate(new Add());
		operation.doOperation(x, y);
		operation.setCalculate(new Subtract());
		operation.doOperation(x, y);
		operation.setCalculate(new Multiply());
		operation.doOperation(x, y);
		operation.setCalculate(new Divide());
		operation.doOperation(x, y);
	}
	
}
