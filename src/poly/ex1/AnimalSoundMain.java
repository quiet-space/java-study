package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Caw[] cawArr = {dog, cat, caw}; // 불가
        Cow[] cowArr = {cow, cow, cow}; // 가능


        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        // soundCow(cat); // cat 타입은 caw 타입을 매개변수로 받는 메서드에 전달하지 못함
        System.out.println("동물소리 테스트 종료");

        soundCow(cow);
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
