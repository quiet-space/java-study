package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NPE ( 참조할 값이 없을 때 )
        System.out.println("data = " + data.value);
    }
}
