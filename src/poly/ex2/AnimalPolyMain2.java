package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        // Dog dog = new Dog(); // = ( Animal dog = new Dog(); )
        // Cat cat = new Cat();
        // Cow cow = new Cow();
        // Duck duck = new Duck();

        Animal animal1 = new Animal();
        animal1.sound();

        // Animal[] animalArr = {dog, cat, duck, cow};
        Animal[] animalArr = {new Dog(), new Cat(), new Duck(), new Cow(), new Pig()};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 완료");
        }
    }
}