package io.craft.armor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author warden
 * @author mindwind
 * @version 1.0, Dec 18, 2014
 */
public class ArmorInvocationHandler implements InvocationHandler {
	
	
	private Object delegate;
	
	
	public ArmorInvocationHandler(Object delegate) {
		 this.delegate = delegate;
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(delegate, args);
	}
	

}