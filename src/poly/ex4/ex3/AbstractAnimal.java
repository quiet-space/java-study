package poly.ex4.ex3;

// 순수 추상 클래스: 모든 메서드가 코드를 실행할 바디를 전혀 안 가지고 있음
// 인스턴스를 생성할 수 없다
// 상속시 자식은 모든 메서드를 오버라이딩 해야 한다
// 주로 다형성을 위해 사용된다
public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move();
}
