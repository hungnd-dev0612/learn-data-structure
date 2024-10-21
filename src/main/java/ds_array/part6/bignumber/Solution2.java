package ds_array.part6.bignumber;

import java.util.Arrays;
import java.util.Scanner;

//Cách 2
public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Mảng đã cho sẵn
        int[] arr = new int[]{5, 2, 5, 3, 5, 1};
        int n = arr.length;
        int[] frequency = new int[arr.length]; // Mảng tần suất
        int q = scan.nextInt();
        int[] finalArr = new int[arr.length];
        Arrays.sort(arr);
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int i = l; i <= r; i++) {
                frequency[i]++;
            }
            q--;
        }
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(frequency[b], frequency[a]));
        System.out.println(Arrays.toString(indices));
        System.out.println(Arrays.toString(frequency));
        // Tạo mảng kết quả
        for (int i = 0; i < n; i++) {
            finalArr[indices[i]] = arr[n - 1 - i];
        }
        System.out.println(Arrays.toString(finalArr));
        int sum = 0;
        q = 2;
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for (int i = l; i <= r; i++) { // Lưu ý là sử dụng <= để bao gồm r
                sum += finalArr[i]; // Tính tổng các giá trị
            }
            q--;
        }

        System.out.println(sum);
    }
}
