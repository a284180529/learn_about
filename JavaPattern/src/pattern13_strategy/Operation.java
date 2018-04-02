package pattern13_strategy;

public class Operation {
	
	private ICalculate calculate;

	public void setCalculate(ICalculate calculate) {
		this.calculate = calculate;
	}
	
	public void doOperation(int x, int y) throws Throwable {
		if (calculate == null) {
			throw new Throwable("must setCalculate before doOperation");
		}
		int result = calculate.calculate(x, y);		
		System.out.println(calculate.getClass().getSimpleName() + " doOperation --> " + result);
	}

}
