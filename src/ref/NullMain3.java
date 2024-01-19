package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이게 없으면 12line에서 NPE 발생 (참조할 값이 없음)

        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
