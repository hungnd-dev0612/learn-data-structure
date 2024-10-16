package ds_array;

import java.util.Arrays;

public class Test3 {
    static class Query {
        int left, right;
        Query(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static long maximizeQuerySum(int[] arr, Query[] queries) {
        int n = arr.length;
        int[] frequency = new int[n];

        // Tính tần suất xuất hiện của mỗi vị trí trong các truy vấn
        for (Query query : queries) {
            frequency[query.left]++;
            if (query.right + 1 < n) {
                frequency[query.right + 1]--;
            }
        }
        System.out.println(Arrays.toString(queries));
        // Tính tổng tích lũy của tần suất
        for (int i = 1; i < n; i++) {
            frequency[i] += frequency[i - 1];
        }

        // Sắp xếp mảng tần suất và mảng gốc
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(frequency[b], frequency[a]));

        Arrays.sort(arr);

        // Tạo mảng mới với các phần tử được sắp xếp tối ưu
        int[] optimizedArr = new int[n];
        for (int i = 0; i < n; i++) {
            optimizedArr[indices[i]] = arr[n - 1 - i];
        }
        System.out.println(Arrays.toString(optimizedArr));
        // Tính tổng của các truy vấn trên mảng đã tối ưu
        long totalSum = 0;
        for (Query query : queries) {
            for (int i = query.left; i <= query.right; i++) {
                totalSum += optimizedArr[i];
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 5, 1};
        Query[] queries = {
                new Query(1, 4),
                new Query(1, 3)
        };

        long result = maximizeQuerySum(arr, queries);
        System.out.println("Tổng tối đa của các truy vấn: " + result);

        // In ra mảng đã tối ưu để kiểm tra
        System.out.println("Mảng sau khi tối ưu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
