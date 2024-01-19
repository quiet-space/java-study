package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA: " + dataA);

        changeReference(dataA);
        // 메서드 호출
        // dataX = dataA
        // dataX.value = dataA.value = 20

        // dataA.value = 20, dataX.value = 20(메서드 실행 완료시 삭제)

        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
        System.out.println("dataX: " + dataX);
    }
}
