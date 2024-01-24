package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // 메소드 영역에 있는 static 변수에 접근하기 위해 class의 멤버 변수 (Data3.count)에 직접 접근
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count);  // 4
        // 인스턴스 내 변수 접근 > static > static 변수 접근

        //클래스를 통한 접근
        System.out.println(Data3.count); // 4
        // 클래스 내 변수 접근 > static > static 변수 접근
    }
}
