package poly.ex3;

public class Dog extends AbstractAnimal {

    @Override //추상 클래스를 상속할 경우 반드시 추상메서드를 오버라이드 해야 함
    public void sound() {
        System.out.println("멍멍");
    }
}
