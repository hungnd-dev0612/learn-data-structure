import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Part2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] a = new int[length];
        int total = 0;

        for (int i = 0; i < a.length; i++) {
//            System.out.println("nhập number mảng");
            int number = scan.nextInt();
            a[i] = number;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println(a[i]);
                total += a[i];
            }
        }

        System.out.println(total);
    }
}