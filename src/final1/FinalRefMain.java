package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형
        // data = new Data(); // 재할당 - 불가 (참조형 final : 참조값 변경 불가 )

        // 참조 대상 객체의 값은 변경 가능
        // 참조된 data의 value => final이 아님
        data.value = 10;
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);
    }
}
