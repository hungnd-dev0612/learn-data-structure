package algorithm.search;

import static util.TestPerformUtil.getElementInArray;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int x = 4;
//        getElementInArray(arr);
        int result = jumpSearch3(arr, x);
        if (result != -1) {
            System.out.println("find number " + x + " at index: " + result);
        } else {
            System.out.println("cant find number: " + x);
        }
    }

    public static int jumpSearch(int[] arr, int x) {
        int jump;
        int n = arr.length;
        jump = (int) Math.sqrt(arr.length);
        int start = 0;
        if (arr[n - 1] < x) {
            return -1;
        }
        while (arr[Math.min(jump, n) - 1] < x) {
            start = jump;
            jump += (int) Math.sqrt(n);
        }
        while (arr[Math.min(jump, n) - 1] >= x) {
            if (jump >= n) {
                jump = n - 1;
            }
            for (int i = jump; i >= start; i--) {
                if (arr[i] == x) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int jumpSearch2(int[] arr, int x) {
        int n = arr.length;
        int jump = (int) Math.sqrt(n);
        int start = 0;
        while (arr[Math.min(jump, n) - 1] < x) {
            start = jump;
            jump += (int) Math.sqrt(n);
            if (start >= n) {
                return -1;
            }
        }
        while (arr[start] < x) {
            start++;
            if (start == Math.min(jump, n)) {
                return -1;
            }
        }
        if (arr[start] == x) {
            return start;
        }
        return -1;

    }


    public static int jumpSearch3(int[] arr, int x) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        // Kiểm tra từ phần tử trước đó đến bước nhảy cuối cùng
        while (prev < Math.min(step, n)) {
            if (arr[prev] == x) {
                return prev;
            }
            prev++;
        }

        return -1;
    }
}
