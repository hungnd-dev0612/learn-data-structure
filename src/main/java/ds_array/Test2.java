package ds_array;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Đọc số lượng phần tử và mảng
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int q = scan.nextInt();
        int[] frequency = new int[n]; // Mảng tần suất

        // Bước 1: Đếm tần suất từ các truy vấn
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int i = l; i <= r; i++) {
                frequency[i]++;
            }
            q--;
        }

        // Bước 2: Tạo mảng để lưu giá trị đã sắp xếp
        int[] sortedArr = new int[n];

        // Tạo một mảng tạm để sắp xếp arr theo tần suất
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }

        // Sắp xếp tần suất cùng với giá trị tương ứng
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Nếu tần suất cao hơn, hoán đổi tần suất và giá trị trong arr
                if (frequency[j] < frequency[j + 1]) {
                    // Hoán đổi tần suất
                    int tempFreq = frequency[j];
                    frequency[j] = frequency[j + 1];
                    frequency[j + 1] = tempFreq;

                    // Hoán đổi giá trị trong sortedArr
                    int tempVal = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = tempVal;
                }
            }
        }

        // Bước 3: Tính tổng cho các truy vấn
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sortedArr[i]; // Tính tổng các giá trị
        }

        // In ra kết quả
        System.out.println(sum);
    }
}
