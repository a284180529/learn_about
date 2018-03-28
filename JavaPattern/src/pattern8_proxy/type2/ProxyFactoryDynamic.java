package pattern8_proxy.type2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class ProxyFactoryDynamic {
	
	private Object target;

	public ProxyFactoryDynamic(Object object) {
		this.target = object;
	}
	
	public Object getProxyInstance() {
		Class<? extends Object> classloader = target.getClass();
		return Proxy.newProxyInstance(classloader.getClassLoader(), classloader.getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String nameString = method.getName();
				System.out.println("proxy before method-->" +  nameString);
				Object result = method.invoke(target, args);
				System.out.println("proxy after method");
				return result;
			}
		});
	}

}
