package class1;

public class ClassStart3 {
    // 단축키 = psvm 탭
    public static void main(String[] args) {
        // * 객체, 혹은 인스턴스 생성
        // 실제로 할당한 변수를 객체, 인스턴스라고 부른다
        // 클래스 = 객체(인스턴스)를 정의하는 자료 타입, 생성 시 메모리에 할당됨
        // 인스턴스 = 객체보다 더 "관계"적인 용어
        // 아래 경우 student1은 Student의 인스턴스라고 표현한다

        Student student1;
        student1 = new Student();

        // 값 할당
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 객체, 혹은 인스턴스 생성
        // new ClassName() => 해당 변수를 할당하기 위한 새로운 메모리를 만들어라
        Student student2 = new Student();

        // 값 할당
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        단축키 = sout 탭
        System.out.println("이름:" + student1.name + " 나이2:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이2:" + student2.age + " 성적:" + student2.grade);
    }
}
