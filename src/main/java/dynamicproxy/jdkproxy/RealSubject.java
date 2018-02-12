package dynamicproxy.jdkproxy;

public class RealSubject implements Subject {
    public void visit() {
        System.out.println("--------- visit -----------");
    }
}
