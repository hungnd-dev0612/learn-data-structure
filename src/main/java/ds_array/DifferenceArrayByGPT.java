package ds_array;

import java.util.Arrays;
/*
    Cho mảng arr[ ] có N phần tử, có Q thao tác mỗi thao tác sẽ
    tăng các phần tử trong đoạn từ chỉ số L tới R của mảng arr[ ] lên K đơn
    vị. Hãy xác định mảng arr[ ] sau Q thao tác. Sử dụng java nhé
 */

/*
    Ideal cách xử lý của GPT:
=====================================
*Tạo mảng D[]
=> xử lý thao tác Q trên D[]
=> cộng dồn mảng D[]
=> cộng mảng arr[] và mảng D[]
=====================================
    B1: Khởi tạo mảng
    B2: Xử lý thao tác Q trên mảng khởi tạo D[0,0,0,0,0,0,0]
    B3: Cộng phần tử mảng D và mảng arr
    ***B1:
    Khởi tạo mảng D[n+1], sau đó xử lú mảng lần lượt theo Q thao tác và công thức như sau
    D[L] += k và D[R+1] -= k theo L,R,K = [2,3,4] | [1,4,3] thì lúc này
    D[] sẽ có dạng
    Lần 1: D[0,0,4,0,-4,0,0]
    Lần 2: D[0,3,4,0,-4,-3,0]
    ***B2:
    Cộng dồn mảng D[] sau đó cộng vào mảng arr[] lại với nhau đúng theo vị trí
    D = D[0,3,4,0,-4,-3,0] ==> D[0,3,7,7,3,0]
    arr = arr[3,1,8,7,6,2]
    D[i] = D[i] + D[i - 1]
    arr[i] += D[i]
    nó sẽ hoạt động như sau
    D[0,3,7,7,3,0]
    arr[3,1,8,7,6,2]
==> arr[3,4,15,14,9,2]
 */
public class DifferenceArrayByGPT {
    public static void main(String[] args) {
        long start = System.nanoTime();
        testFunc();
        long duration = (System.nanoTime() - start);
        double result1 = (double) duration / 1000000;
        System.out.println(result1 + " ms");
    }

    public static void testFunc() {
        int[] arr = {3, 1, 8, 7, 6, 2};
        int n = arr.length;

        // Các thao tác: {L, R, K}
        int[][] operations = {
                {2, 3, 4},
                {1, 4, 3}
        };
        // Mảng phụ dùng để tính hiệu ứng tăng giảm
        int[] D = new int[n + 1];
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
        for (int i = 1; i < D.length; i++) {
            D[i] += D[i - 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = D[i] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
