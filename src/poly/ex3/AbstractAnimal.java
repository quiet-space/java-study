package poly.ex3;

public abstract class AbstractAnimal {
    // 추상 클래스 (동작하는 불완전한 클래스)
    // 클래스는 선언하나 '생성'되지 않음
    // 추상 클래스를 하나라도 가지고 있는 클래스는 반드시 추상 클래스여야 한다
    public abstract void sound();
    // 추상클래스의 메서드는 바디를 가질 수 없다

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
