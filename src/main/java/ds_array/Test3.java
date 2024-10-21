package ds_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int n = arr.length;
        int[] frequency = new int[n]; // Mảng tần suất
        int[] finalArr = new int[n];

        // Các truy vấn để tính tần suất (giả sử đã biết trước)
        int[][] queries = {{1, 4}, {1, 3}};

        // Tính tần suất
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            for (int i = l; i <= r; i++) {
                frequency[i]++;
            }
        }

        // Tạo mảng chỉ số và sắp xếp theo tần suất giảm dần
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(frequency[b], frequency[a]));

        // Tạo một bản sao của mảng arr và sắp xếp nó giảm dần
        Integer[] sortedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedArr, Collections.reverseOrder());

        // Tạo mảng kết quả
        for (int i = 0; i < n; i++) {
            finalArr[indices[i]] = sortedArr[i];
        }

        // Tính tổng cho các truy vấn
        int sum = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            for (int i = l; i <= r; i++) {
                sum += finalArr[i];
            }
        }

        System.out.println("Tổng của các truy vấn: " + sum);
    }
}
