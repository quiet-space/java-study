package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child > Child");
        System.out.println("value =" + child.value);
        child.method();

        //부모변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent > Parent");
        System.out.println("value =" + parent.value);
        parent.method();

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value=" + poly.value); // parent
        poly.method(); //오버라이딩한 메서드가 우선권을 가진다.
        // Parent Method가 오버라이딩된 Method를 찾고 Child의 Method를 불러옴
        // 결과: Child.method
    }
}
