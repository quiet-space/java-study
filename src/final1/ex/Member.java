package final1.ex;

public class Member {
    private final String id;
    private String name;


    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        // this.id = id; // 재할당 불가능, 컴파일 에러
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id + " name: " + name);
    }
}
