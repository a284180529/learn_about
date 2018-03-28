package pattern8_proxy.type1;

import pattern8_proxy.IProxy;
import pattern8_proxy.Target;

/**
 *	静态代理
 */
public class ProxyStatic implements IProxy{
	
	private Target mTarget;

	public ProxyStatic(Target target) {
		this.mTarget = target;
	}

	@Override
	public void method() {
		System.out.println("before target method");
		mTarget.method();
		System.out.println("after target method");
	}

}
