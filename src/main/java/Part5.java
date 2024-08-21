import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Scanner;

/*
Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy array. Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).

Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1. In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.

*/
@Log4j2
public class Part5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = scan.nextInt();
        }

        int k = scan.nextInt();
        int x = scan.nextInt();
        int temp = 0;
//        int[] array2 = new int[n + 1];
        for (int i = n; i > k; i--) {
            array[i] = array[i - 1];
        }
        array[k] = x;
        String emptyString = "";
        for(int i : array){
            emptyString = emptyString.concat(String.valueOf(i)).concat(" ");
        }
//        scan.close();
        System.out.println(emptyString);
    }
}
