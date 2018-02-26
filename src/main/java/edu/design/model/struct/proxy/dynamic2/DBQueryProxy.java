package edu.design.model.struct.proxy.dynamic2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DBQueryProxy implements MethodInterceptor {  
	  
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {  
        System.out.println("Here in interceptor ！");  
        return methodProxy.invokeSuper(o, objects);  
    }  
}  


