package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
//        정의된 생성자가 여러개여도 단 하나의 생성자만 호출됨
        MemberConstruct member1 = new MemberConstruct("user1", 14, 80);
        MemberConstruct member2 = new MemberConstruct("user2", 17);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members) {
            System.out.println("이름" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
