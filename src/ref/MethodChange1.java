package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);

        changePrimitive(a);
        // 메서드 호출
        // int x = a
        // x = 20
        // a = 10, x = 20

        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
        // main 실행 후 매개변수 x 는 삭제된다.
    }
}
