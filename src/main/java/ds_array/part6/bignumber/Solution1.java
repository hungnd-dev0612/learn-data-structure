package ds_array.part6.bignumber;

import java.util.Arrays;
import java.util.Scanner;

//Cách 1
public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[]{5, 2, 5, 3, 5, 1};
        int n = arr.length;
        int[] frequency = new int[arr.length];
        int q = scan.nextInt();
        while (q > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            //dem so luong truy xuat
            arrayAccessCount(frequency, l, r);
            q--;
        }
            //mang hieu
        diffArray(frequency);
            //sort 2 mang theo ti le thuan
        Arrays.sort(frequency);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(frequency));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * frequency[i];
        }
        System.out.println(sum);
    }
    public static void arrayAccessCount(int[] arr, int left, int right) {
        arr[left] += 1;
        arr[right + 1] -= 1;
    }
    public static void diffArray(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}
