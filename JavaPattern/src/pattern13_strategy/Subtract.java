package pattern13_strategy;

public class Subtract implements ICalculate{

	@Override
	public int calculate(int x, int y) {
		return x - y;
	}

}
