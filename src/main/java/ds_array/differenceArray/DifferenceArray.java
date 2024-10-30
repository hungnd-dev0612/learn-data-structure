package ds_array.differenceArray;

import util.TestPerformUtil;

import java.util.Arrays;

/*
    Cho mảng arr[ ] có N phần tử, có Q thao tác mỗi thao tác sẽ
    tăng các phần tử trong đoạn từ chỉ số L tới R của mảng arr[ ] lên K đơn
    vị. Hãy xác định mảng arr[ ] sau Q thao tác. Sử dụng java nhé
 */

/*
    Ideal cách xử lý:
=====================================
*Tạo mảng D[]
=> lấy mảng D làm hiệu của mảng arr
=> xử lý thao tác Q
=> cộng dồn mảng D
=====================================
    B1: Khởi tạo mảng
    B2: Gọi mảng D là mảng hiệu của mảng arr
    arr[3,1,8,7,6,2]
==> D[3,-2,7,-1,-1,-4]
    B3: Xử lý thao tác Q trên mảng hiệu D[]
    [L,R,K][2,3,4] ==> D[3,-2,11,-1,-5,-4,0]
    [L,R,K][1,4,3] ==> D[3,1,11,-1,-5,-7,0]
    B4: Cộng dồn mảng hiệu ==> D[3,4,15,14,9,2]
 */
public class DifferenceArray {
    public static void main(String[] args) {
        double executionTime = TestPerformUtil.measureExecutionTime(DifferenceArray::testFunc);
        System.out.println(executionTime + " millisecond");
    }
    public static void testFunc() {
        // Mảng ban đầu
        int[] arr = {3,1,8,7,6,2};
        int n = arr.length;
        int[] D = new int[n + 1];

//     lấy mảng D làm hiệu của mảng arr
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                D[i] = arr[i];
            } else {
                D[i] = arr[i] - arr[i - 1];
            }
        }
        // Các thao tác: {L, R, K}
        int[][] operations = {
                {2, 3, 4},
                {1, 4, 3}
        };
        // Áp dụng các thao tác
        for (int[] operation : operations) {
            int L = operation[0];
            int R = operation[1];
            int K = operation[2];

            // Tăng từ L đến R
            D[L] += K;
            if (R + 1 < n) {
                D[R + 1] -= K;
            }
        }
        for (int i = 1; i < n; i++) {
            arr[i] = D[i] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
