package static1;

public class Data3 {
    public static int count; // 클래스 변수 = static 이 붙은 멤버 변수
    public String name; // 인스턴스 변수 = static이 붙지 않은 멤버 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
