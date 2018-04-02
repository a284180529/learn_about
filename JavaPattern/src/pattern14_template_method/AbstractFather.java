package pattern14_template_method;

public abstract class AbstractFather {

	public void operation() {
		step1();
		step2();
		step3();
	}

	// 差异性操作放在子类中实现
	protected abstract void step3();

	// 差异性操作放在子类中实现
	protected abstract void step2();

	private void step1() {
		// 公用的操作放在父类
		System.out.println("AbstractFather --> step1");
	}
	
	
}
