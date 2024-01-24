package final1;

public class finalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        // final = 최초 한번만 할당 가능
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; //컴파일 오류

        final int data2 = 10; // 최초 할당
        // data2 = 20; //컴파일 오류
    }

    static void method(final int parameter) {
        // parameter = 20; // 컴파일 오류
    }
}
