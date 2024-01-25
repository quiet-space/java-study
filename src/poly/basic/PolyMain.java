package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent > Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child > Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // *** 부모 변수가 자식 인스턴스 참조 (다형성 참조)
        // 부모 타입은 자식 참조 가능
        // Parent poly (부모 타입)
        // new Child() (자식 참조)

        // 손자가 있다면 손자 타입도 참고 가능
        // 자신을 기준으로 모든 자식 타입을 참조할 수 있다. (하지만 반대로 자식 -> 부모/조상 타입은 불가능)
        // ex) Parent poly = new Grandson(); (Child 하위의 손자 타입)

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 호출 불가 -> 자식의 기능은 호출할 수 없다
        // poly.childMethod();
        // 참조 타입은 Child가 맞으나, 자식의 기능을 호출하기 위해서 부모->자식순으로 찾아갈 수는 없다
        // 이런 경우 자식의 메소드를 호출하고 싶다면 캐스팅이 필요하다.

        // *** 자식 타입은 부모 참조 불가
        // Child child1 = new Parent() // 컴파일 에러

        // ** 정리
        // 다형성: 부모타입은 자식타입을 참조할 수 있다.
    }
}
