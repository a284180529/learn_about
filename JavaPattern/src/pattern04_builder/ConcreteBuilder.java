package pattern04_builder;

public class ConcreteBuilder implements IBuilder {

	private Computer mComputer = new Computer();

	@Override
	public IBuilder buildCPU(String cpu) {
		mComputer.add(cpu);
		return this;
	}

	@Override
	public IBuilder buildMemory(String memory) {
		mComputer.add(memory);
		return this;
	}

	@Override
	public IBuilder buildHD(String hd) {
		mComputer.add(hd);
		return this;
	}

	@Override
	public IBuilder buildMainboard(String mainboard) {
		mComputer.add(mainboard);
		return this;
	}

	@Override
	public Computer getComputer() {
		return mComputer;
	}

}
