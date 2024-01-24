package memory;

public class JavaMemory2 {
    public static void main(String[] args) {
        System.out.println("main Start");
        method1();
        System.out.println("main End");
    }

    static void method1() {
        System.out.println("method1 Start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 End");
    }

    static void method2(Data data2) {
        System.out.println("method2 Start");
        System.out.println("dasta.value = " + data2.getValue());
        System.out.println("method2 End");
    }
}
