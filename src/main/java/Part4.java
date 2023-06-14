import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Scanner;

@Log4j2
public class Part4 {
    /*
    * Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).
    * Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1.
    * In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap length: ");
        int n;
        n  = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu: ");
            array[i] = scan.nextInt();
        }
        System.out.println("nhap k: ");
        int k = scan.nextInt();
        System.out.println("nhap x: ");
        int x = scan.nextInt();
        for (int i = n; i >= k + 1; i--) {
            array[i] = array[i - 1];
        }
        array[k] = x;
        String arrayToString = "";
        for(int i : array){
            arrayToString = arrayToString.concat(String.valueOf(i)).concat(" ");
        }
        System.out.println(arrayToString);
        scan.close();
    }

}
