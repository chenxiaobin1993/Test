package dynamicproxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor {

    private Object target;

    public Object getProxyInstance(Object target) {
        this.target = target;
        //声明增强类实例
        Enhancer enhancer = new Enhancer();
        //设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(this.target.getClass());
        //设置要代理的拦截器，回调函数
        enhancer.setCallback(this);

        return enhancer.create();

    }


    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable{
        System.out.println("---------- before ---------");

        methodProxy.invokeSuper(obj, objects);

        System.out.println("---------- after ----------");
        return null;
    }
}
