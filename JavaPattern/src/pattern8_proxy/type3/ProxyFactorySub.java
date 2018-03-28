package pattern8_proxy.type3;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *	子类代理
 */
public class ProxyFactorySub implements MethodInterceptor{
	
	private Object target;

	public ProxyFactorySub(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		String nameString = method.getName();
		System.out.println("proxy before method-->" +  nameString);
		Object result = method.invoke(target, args);
		System.out.println("ProxyFactorySub after method");
		return result;
	}

}
