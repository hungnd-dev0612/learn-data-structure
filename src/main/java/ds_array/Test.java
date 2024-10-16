package ds_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc kích thước mảng và số lượng truy vấn
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];

        // Đọc các phần tử của mảng
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Mảng để đếm số lần xuất hiện của mỗi chỉ số
        int[] count = new int[n];

        // Đọc các truy vấn
        for (int i = 0; i < q; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            // Cập nhật số lần yêu cầu cho từng chỉ số
            count[L - 1]++;
            if (R < n) {
                count[R]--;
            }
        }

        // Chuyển mảng count thành số lần yêu cầu thực tế
        for (int i = 1; i < n; i++) {
            count[i] += count[i - 1];
        }

        // Sắp xếp mảng ban đầu và mảng count
        Arrays.sort(arr);
        Arrays.sort(count);

        // Tính tổng tối đa
        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += (long) arr[i] * count[i];
        }

        System.out.println(maxSum);
    }
}
