package dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicProxy(realSubject);

        Subject proxyInstance = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                RealSubject.class.getInterfaces(),
                handler
                );
        proxyInstance.visit();
    }
}
