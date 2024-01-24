package memory;

public class JavaMemory1 {
    public static void main(String[] args) {
        // * 스택으로 실행
        // 메인이 가장 먼저 실행됐으나,
        // 그 다음으로 실행된 메소드1, 2의 시작&종료가 완료된 후
        // 메인이 종료됨

        // 인스턴스 소멸 -> 스택 프레임 종료(제거)
        // 스택 프레임 전체 소멸(종료) -> 프로그램 종료
        System.out.println("메인 시작");
        method1(10);
        System.out.println("메인 끝");
    }

    static void method1(int m1) {
        System.out.println("메소드1 시작");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("메소드1 끝");
    }

    static void method2(int m2) {
        System.out.println("메소드2 시작");
        System.out.println("메소드2 끝");
    }
}
