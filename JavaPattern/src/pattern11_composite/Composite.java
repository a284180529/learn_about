package pattern11_composite;

import java.util.ArrayList;
import java.util.List;

/**
 *  容器构件
 */
public class Composite extends Component {
	
	private List<Component> components = new ArrayList<Component>();
	private String name;
	
	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void add(Component component) {
		components.add(component);
	}
	
	@Override
	public void remove(Component component) {
		components.remove(component);
	}
	
	@Override
	public Component getChild(int position) {
		if (position < components.size()) {
			return components.get(position);
		} else {
			return null;
		}
	}

	@Override
	public void operation() {
		System.out.println("this is Leaf method operation --> " + name);
		for (Component component : components) {
			component.operation();			
		}
	}

}
