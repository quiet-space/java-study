package pack;

//import pack.a.User;
//import pack.a.User2;

// package.a 하위의 모든 Class를 import
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();

        // import한 Classes
        User user = new User();
        User2 user2 = new User2();
    }
}
