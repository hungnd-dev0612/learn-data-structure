package algorithm.search;
import java.util.Arrays;

import static util.TestPerformUtil.measureExecutionTime;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int x = 999999;
        Arrays.sort(arr);
        double time = measureExecutionTime(() -> {
            int result = binarySearch(arr, x);
            if (result != -1) {
                System.out.println("find number " + x + " at index: " + result);
            } else {
                System.out.println("cant find number: " + x);
            }
        });
        System.out.println("time running: " + time);
    }

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
//            mid = (low + high) / 2
            mid = low + (high - low) / 2; //tránh tràn số, ví dụ (2,147,483,645 + 2,147,483,640) / 2 thì phép cộng được làm trước dẫn đến tràn số int
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {  // arr[mid] < x
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return arr[i];
            }
        }
        return -1;
    }

}
