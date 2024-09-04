import java.util.Arrays;
import java.util.Scanner;

public class Part5 {
    /*
    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Tiếp theo nhập vào số nguyên là k (0 ≤ k < n).
    Hãy xóa phần tử có chỉ số k ở trong dãy đó. In mảng kết quả ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Nhập độ dài mảng: ");

        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            // System.out.println("Nhập phần tử mảng: ");
            array[i] = scan.nextInt();
        }
        // System.out.println("Nhập phần tử k: ");
        int k = scan.nextInt();

        for (int i = k; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        String emptyString = "";

        for (int i = 0; i < n; i++) {
            emptyString = emptyString.concat(String.valueOf(array[i])).concat(" ");
        }
        System.out.println(emptyString);
    }
}