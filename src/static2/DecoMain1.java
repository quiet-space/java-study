package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "Hello Java";

        // 생성된 각 인스턴스마다 메서드(deco)를 찾아와야 함
        DecoUtil utils = new DecoUtil();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
