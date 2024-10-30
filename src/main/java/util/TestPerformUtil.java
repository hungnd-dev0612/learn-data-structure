package util;

import java.math.BigDecimal;

public final class TestPerformUtil {
    private TestPerformUtil() {
    }

    //return milliseconds execution time
    public static double measureExecutionTime(Runnable func) {
        long start = System.nanoTime();
        func.run();
        long duration = System.nanoTime() - start;
        return (double) duration / 1000000;
    }

    public static int[] getElementInArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
