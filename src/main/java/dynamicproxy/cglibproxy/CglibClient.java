package dynamicproxy.cglibproxy;

public class CglibClient {

    public static void main(String[] args) {
        CglibDynamicProxy cglib = new CglibDynamicProxy();
        CglibRealSubject realSubject = (CglibRealSubject)cglib.getProxyInstance(new CglibRealSubject());
        realSubject.visit();
        realSubject.test();
    }
}
