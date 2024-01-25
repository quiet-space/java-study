package poly.ex4.ex3;

public class Cow extends AbstractAnimal {

    @Override //추상 클래스를 상속할 경우 반드시 추상메서드를 오버라이드 해야 함
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
