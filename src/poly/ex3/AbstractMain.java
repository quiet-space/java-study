package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스 생성 불가 -> AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        // 추상클래스를 다형적 참조 -> 오버라이딩 된 메서드를 우선순위로
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 완료");
    }
}
