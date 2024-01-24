package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
        // 하나의 Java 파일 안에는 하나의 Public Class만 가능
        // import도 당연히 안 됨
//        DefaultClass1 class1 = new DefaultClass1();
    }
}
