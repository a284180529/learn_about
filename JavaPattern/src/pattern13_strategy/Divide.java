package pattern13_strategy;

public class Divide implements ICalculate{

	@Override
	public int calculate(int x, int y) {
		return x / y;
	}

}
