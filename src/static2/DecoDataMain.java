package static2;

//import static static2.DecoData.staticCall;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        // 정적 메서드 = 클래스 메서드는
        // 인스턴스에 보관되는 게 아니라, 클래스 영역에 보관되므로
        // 힙에 객체를 생성하지 않고, 바로 클래스에서 꺼내다 쓸 수 있기 때문에
        // new 인스턴스 선언이 필요하지 않음
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        // 인스턴스 메서드는 인스턴스 안에서 꺼내다 써야 하기 때문에
        // new 인스턴스 선언이 필요함
        DecoData data1 = new DecoData();
        data1.instanceCall();

        // Static Method에서 Instance Variables 참조 불가
        // DecoData.staticCall(data1);
    }
}
