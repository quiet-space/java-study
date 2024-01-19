package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        // 이때 생성되고, 12line에서 null로 초기화된 인스턴스는
        // 어디에서도 참조되지 않기 때문에
        // JVM의 Garbage Collector가 제거
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
    }

//    static void change
}
