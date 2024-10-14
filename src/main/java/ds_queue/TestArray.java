package ds_queue;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int A[] = new int[]{8, 7, 6, 5, 6, 6};
        int pre[] = new int[A.length];
        for (int i = 0; i < pre.length; i++) {
            if (i == 0) pre[i] = A[i];
            else pre[i] = pre[i - 1] + A[i];
        }
        System.out.println(Arrays.toString(pre));
    }

}
