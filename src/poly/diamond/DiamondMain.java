package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // InterfaceA a 을 생성한다
        // new Child();를 참조하여

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
