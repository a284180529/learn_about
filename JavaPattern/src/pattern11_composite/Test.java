package pattern11_composite;

public class Test {
	
	// 组合模式：组合多个对象形成树型结构比表示具有“部分-整体”关系的层次结构
	
	public static void main(String[] args) {
		Composite composite1 = new Composite("composite1");
		Composite composite2 = new Composite("composite2");
		Composite composite3 = new Composite("composite3");
		
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		Leaf leaf3 = new Leaf("leaf3");
		
		composite1.add(leaf1);
		composite2.add(leaf2);
		composite3.add(leaf3);
		
		composite1.add(composite2);
		composite2.add(composite3);
		
		composite1.operation();
		
		leaf1.add(leaf2);
	}

}
