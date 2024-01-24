package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 가능
        // data.defaultField = 2;
        // data.defaultMethod();

        // 패키지 외부에서 private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        // public
        // inner가 자신의 패키지에서 호출하는 것들은 가능
        data.innerAccess();

    }
}
