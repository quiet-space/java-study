package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // [length]
        // 대입하지 않으면 null로 저장됨 {null, null}

        // 인스턴스가 복사되는 것이 아니라, 참조값이 복사되는 것
        // student1에 저장되어 있는 값은 student1로도, students[0]로도 접근할 수 있게 된 것
        // 인스턴스가 복사되어 새로 생성된 게 아님
        // '실제 변수값 = 참조값'이 복사됨에 주의 / * C - 포인트 개념 참고
        students[0] = student1;
        students[1] = student2;

        // System.out.println("이름:" + students[0].name + " 나이2:" + students[0].age + " 성적:" + students[0].grade);
        // System.out.println("이름:" + students[1].name + " 나이2:" + students[1].age + " 성적:" + students[1].grade);

        students[0].name = "변경";
        System.out.println(students[0].name); // 출력값: "변경"
        System.out.println(student1.name); // 출력값: "변경"
    }
}
