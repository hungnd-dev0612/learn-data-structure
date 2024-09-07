import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        // Nhập dãy số
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        int[] frequency = new int[max + 1];
        for (int i = 0; i < numbers.length; i++) {
            frequency[numbers[i]]++;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] > 0) {
                System.out.print(i + "-" + frequency[i]);
                 System.out.print("; ");
            }
        }
//        int [] a = new int [] {1,2,3,4,5};
//        System.out.println(a.length);
    }
}
