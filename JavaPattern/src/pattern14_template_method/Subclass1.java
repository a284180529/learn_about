package pattern14_template_method;

public class Subclass1 extends AbstractFather{

	@Override
	protected void step3() {
		System.out.println("Subclass1 --> step3");
	}

	@Override
	protected void step2() {
		System.out.println("Subclass1 --> step2");
	}

}
