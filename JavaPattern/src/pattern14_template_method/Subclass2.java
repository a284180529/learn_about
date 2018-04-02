package pattern14_template_method;

public class Subclass2 extends AbstractFather {

	@Override
	protected void step3() {
		System.out.println("Subclass2 --> step3");
	}

	@Override
	protected void step2() {
		System.out.println("Subclass2 --> step2");
	}

}
