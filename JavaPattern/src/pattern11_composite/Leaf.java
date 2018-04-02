package pattern11_composite;

/**
 *  叶子结构
 */
public class Leaf extends Component{

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("this is Leaf method operation --> " + name);
	}

}
