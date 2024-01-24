package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "Hello Java";

        // * static method
        // 인스턴스에 만들 필요 없이, static Method를 바로 불러옴
        String deco = DecoUtil2.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
