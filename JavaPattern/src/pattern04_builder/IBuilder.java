package pattern04_builder;

public interface IBuilder {
	
	IBuilder buildCPU(String cpu);
	
	IBuilder buildMemory(String memory);
	
	IBuilder buildHD(String hd);
	
	IBuilder buildMainboard(String mainboard);
	
	Computer getComputer();

}
