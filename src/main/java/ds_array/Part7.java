package ds_array;

import java.util.Arrays;
import java.util.Scanner;

public class Part7 {

    /*
    Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số,
    hãy đếm tần số (số lần xuất hiện) của các số trong dãy và in nó ra màn hình dưới dạng sau: "a1 - t1; a2 - t2; ... an - tn; ",
    trong đó t1 là số lần xuất hiện của số a1, t2 là số lần xuất hiện của a2, ... a1, a2, .. an không trùng nhau và được sắp xếp tăng dần (xem ví dụ để rõ hơn)
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập độ dài mảng: ");

        int n = scan.nextInt();
        int[] array = new int[n];
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử mảng: ");
            array[i] = scan.nextInt();
        }
//        System.out.println("Nhập phần tử k: ");
        String emptyString = "";
//        for(int i = 0;i < n; i ++){
//            count(array[i],array,0,emptyString);
//        }
        boolean checkElementHandled [] = new boolean[n];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            // Nếu phần tử đã được xử lý thì bỏ qua
            if (checkElementHandled[i]) continue;

            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    checkElementHandled[j] = true; // Đánh dấu phần tử đã xử lý
                }
            }

            // Thêm phần tử và tần số vào chuỗi kết quả
            emptyString = emptyString.concat(String.valueOf(array[i]))
                    .concat(" - ")
                    .concat(String.valueOf(count))
                    .concat("; ");
        }
        System.out.println(emptyString);
    }

    public static String count(int num, int[] array, int count, String emptyString) {
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == array[i]) {
                count++;
            }
            emptyString = emptyString.concat(String.valueOf(array[i]))
                    .concat("-").
                    concat(String.valueOf(count));
        }
        return emptyString;
    }
}
