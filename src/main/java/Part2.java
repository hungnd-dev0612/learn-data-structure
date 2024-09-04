import java.util.Scanner;

public class Part2 {
    /*
    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
    Hãy đưa ra một số nguyên là tổng tất cả các phần tử trong dãy đó.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int a[] = new int[length];
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