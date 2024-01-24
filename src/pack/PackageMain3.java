package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {

        // 서로 다른 경로에서 같은 이름의 Class를 호출할 때는
        // 더 자주 사용하는 Class를 import 하는 편이 편리하다
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
