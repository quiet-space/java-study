package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 200); // 기본 생성자 생략 가능
        // 단 super의 생성자가 매개변수를 필요로 할 경우에는 첫줄에 부모생성자 호출을 해야 함
        // 해당 경우에는 super 생성자의 매개변수가 비어있으므로 생략 가능함

        System.out.println("class B 생성자 a= " + a);

    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("class B 생성자 a=" + a + " b=" + b);
    }
}
