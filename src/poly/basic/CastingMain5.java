package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

        // new Parent() instanceof Parent // true
        // new Child() instanceof Parent // true -> Child 생성 시 Parent 가지고 있다
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음 - 다운캐스팅!");
            ((Child) parent).childMethod(); // 다운캐스팅
        }
    }
}
