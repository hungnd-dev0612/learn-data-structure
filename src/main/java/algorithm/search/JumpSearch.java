package algorithm.search;

import static util.TestPerformUtil.getElementInArray;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int x = 13;
        int result = jumpSearch(arr, x);
        if (result != -1) {
            System.out.println("find number " + x + " at index: " + result);
        } else {
            System.out.println("cant find number: " + x);
        }
    }

    public static int jumpSearch(int[] arr, int x) {
        if (arr == null || arr.length == 0) return -1;

        int n = arr.length;
        // Check early conditions
        if (x < arr[0] || x > arr[n-1]) return -1;

        // Calculate step size
        int step = (int) Math.sqrt(n);

        // Find the block
        int prev = 0;
        int curr = step;

        // Jump until we find right block
        while (curr < n && arr[curr] <= x) {
            prev = curr;
            curr += step;
        }

        // Linear search in block
        curr = Math.min(curr, n);
        for (int i = prev; i < curr; i++) {
            if (arr[i] == x) return i;
        }

        return -1;
    }
}
