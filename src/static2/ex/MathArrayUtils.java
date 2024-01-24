package static2.ex;

public class MathArrayUtils {
    static int[] values;


    public static int sum(int[] values) {
        int total = 0;
        for (int s : values) {
            total += s;
        }

        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];

        for (int s : values) {
            if (s <= min) {
                min = s;
            }
        }

        return min;
    }

    public static int max(int[] values) {
        int max = values[0];

        for (int s : values) {
            if (s >= max) {
                max = s;
            }
        }

        return max;
    }
}
