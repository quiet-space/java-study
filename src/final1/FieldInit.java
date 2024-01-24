package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // 상수는 대문자 (static final : 공용 상수), 접근제어자 지정 가능
    final int value = 10;

    // public FieldInit(int value) {
    // this.value = value; // 초기값이 존재하기 때문에 재할당 불가능
    // }
}
