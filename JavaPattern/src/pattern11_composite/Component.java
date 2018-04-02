package pattern11_composite;

/**
 *  抽象构件
 */
public abstract class Component {
	
	public void add(Component component) {
		System.out.println("this method add is not support !");
	}
	
	public void remove(Component component) {
		System.out.println("this method remove is not support !");
	}
	
	public Component getChild(int position) {
		System.out.println("this method getChild is not support !");
		return null;
	}
	
	public abstract void operation();

}
