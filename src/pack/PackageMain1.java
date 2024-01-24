package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        // 클래스가 현재와 다른 위치 -> 패키지 경로를 풀네임으로 작성
        pack.a.User user = new pack.a.User();
    }
}
