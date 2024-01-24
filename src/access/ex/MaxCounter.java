package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        // 아래 방식이 아닌 if-else도 동일한 작동
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }
}
