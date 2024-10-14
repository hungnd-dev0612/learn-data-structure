package ds_array;

import java.util.Scanner;

public class Part8 {
    /*
    Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số a.
    Hãy kiểm tra xem dãy a có phải là dãy đơn điệu hay không, trả về "YES" nếu có, "NO" nếu không.
    Một dãy đơn điệu khi nó là dãy số tăng (a[i] > a[i-1]), hoặc dãy số giảm (a[i] < a[i-1]).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử mảng: ");
            arr[i] = scan.nextInt();
        }

        String monotone = isMonotonic(arr);
        System.out.println(monotone);
    }


    public static String isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }if(arr[i] < arr[i - 1]){
                increasing = false;
            }
        }
        return increasing || decreasing ? "YES" : "NO";
    }
}