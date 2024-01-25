package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); // x001
        // 단 자식의 기능은 호출할 수 없다. 컴파일 에러 발생
        // poly.childMethod();

        // ** 다운캐스팅 (부모 -> 자식)
        Child child = (Child) poly; //x001
        child.childMethod(); // 정상
        // (type) -> 특정 타입으로 일시적으로 변경한다는 의미
        child.parentMethod(); // 정상

        // * 실행 순서
        // Child child = (Child) poly // 다운캐스팅으로 부모를 자식 타입으로 변환 뒤 대입
        // Child child = (Child) x001 // 참조값 읽은 다음 자식 타입으로 지정
        // Child child = x001 // 최종 결과

        // 부모는 자식을 담을 수 있지만
        Parent parent1 = new Child(); // 정상
        Parent parent2 = child; // 정상

        // 자식은 부모를 담을 수 없다, 컴파일 에러
        // Child child2 = new Parent();
        // Child child3 = poly;

        // 업캐스팅: 부모 타입으로 변경
        // 다운캐스팅: 자식 타입으로 변경
    }
}
