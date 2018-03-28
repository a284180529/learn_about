package pattern4_builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	
	// 电脑组件集合
	private List<String> parts = new ArrayList<String>();

	// 装部件到电脑中
	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		for (int i = 0;i<parts.size();i++){    
			System.out.println("组件"+parts.get(i)+"装好了");
		}
		System.out.println("电脑组装完成，请验收");
	}

}
