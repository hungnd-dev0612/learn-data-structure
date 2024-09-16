package ds_array;

import java.util.Scanner;

public class Part10 {
    /*
    Nhập và hai số nguyên dương m và n lần lượt là số hàng và số cột của mảng hai chiều a, tiếp theo là nhập các phần tử của mảng đó.
    Hãy tính và đưa ra tổng của tất cả các phần tử trong mảng a.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số cột: ");

        int m = scan.nextInt();
        System.out.println("Nhập số hàng: ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];


        for (int i = 0; i < m; i++) {
            for(int j = 0; j <n; j++){
                System.out.println("nhập phần tử số hàng ");
                arr[i][j] = scan.nextInt();
            }
        }
        int temp = 0;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j <n; j++){
                temp += arr[i][j];
            }

        }
        System.out.println(temp);
    }
}
