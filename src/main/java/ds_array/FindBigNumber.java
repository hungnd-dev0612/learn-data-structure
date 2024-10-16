package ds_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Mảng đã cho sẵn
        int[] arr = new int[]{5, 2, 5, 3, 5, 1};
        int[] frequency = new int[arr.length]; // Mảng tần suất
        Arrays.sort(arr);
        // Đọc số lượng truy vấn
        int q = scan.nextInt();

        // Bước 1: Đếm tần suất từ các truy vấn
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int i = l; i <= r; i++) {
                frequency[i]++;
            }
            q--;
        }

        // Tạo mảng cặp (giá trị, tần suất)
        int[][] pairs = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            pairs[i][0] = arr[i]; // Giá trị
            pairs[i][1] = frequency[i]; // Tần suất
        }
        System.out.println(Arrays.deepToString(pairs));
        // Sắp xếp mảng cặp theo tần suất giảm dần
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]); // Sắp xếp theo tần suất giảm dần

        // Tạo mảng kết quả
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = pairs[i][0]; // Lấy giá trị đã sắp xếp
        }

        // Tính tổng cho các truy vấn
        int sum = 0;
        q = 2; // Số lần truy vấn
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int i = l; i <= r; i++) { // Lưu ý là sử dụng <= để bao gồm r
                sum += result[i]; // Tính tổng các giá trị
            }
            q--;
        }

        // In ra kết quả
        System.out.println(sum);
    }
}
