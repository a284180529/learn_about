package pattern13_strategy;

public class Multiply implements ICalculate{

	@Override
	public int calculate(int x, int y) {
		return x * y;
	}

}
