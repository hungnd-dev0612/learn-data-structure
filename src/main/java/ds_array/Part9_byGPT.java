package ds_array;

import java.util.Scanner;

public class Part9_byGPT {
    /*
    Cho dãy a gồm n số nguyên, và dãy b gồm m số nguyên, cả hai dãy đều được sắp xếp không giảm.
    Hãy gộp hai dãy thành một dãy c, sao cho dãy c cũng là dãy không giảm.
    In dãy c ra màn hình, sau mỗi phần tử có đúng một dấy cách.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng A: ");
        int a = scan.nextInt();
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập phần tử mảng A: ");
            arrA[i] = scan.nextInt();
        }

        System.out.println("Nhập độ dài mảng B: ");
        int b = scan.nextInt();
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Nhập phần tử mảng B: ");
            arrB[i] = scan.nextInt();
        }

        int[] arrC = new int[a + b];
        int i = 0, j = 0;

        // Hợp nhất mảng A và B vào mảng C dùng for loop
        for (int k = 0; k < arrC.length; k++) {
            if (i < a && (j >= b || arrA[i] < arrB[j])) {
                arrC[k] = arrA[i];
                i++;
            } else {
                arrC[k] = arrB[j];
                j++;
            }
        }

        // Tạo chuỗi kết quả từ mảng C
        StringBuilder result = new StringBuilder();
        for (int x : arrC) {
            result.append(x).append(" ");
        }

        // In kết quả ra màn hình
        System.out.println(result.toString().trim());
    }
}
