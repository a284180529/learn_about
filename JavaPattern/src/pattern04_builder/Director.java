package pattern04_builder;

public class Director {
	
	public Computer Construct(IBuilder builder) {
		// 确定执行构建顺序，传参
		builder.buildCPU("cpu-->2.5G")
		.buildHD("hd-->500G")
		.buildMemory("memory-->8G")
		.buildMainboard("mainboard-->saiyang");
		
		return builder.getComputer();
	}

}
