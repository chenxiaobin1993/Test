package dynamicproxy.cglibproxy;

public class CglibRealSubject {
    public void visit() {
        System.out.println("I'm a CglibRealSubject");
    }

    public void test() {
        System.out.println("test");
    }
}
