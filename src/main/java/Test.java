import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        // Nhập dãy số
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Tìm giá trị lớn nhất trong mảng
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Khởi tạo mảng đếm tần suất
        int[] frequency = new int[max + 1];

        // Đếm tần suất
        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            int currentFrequency = frequency[currentNumber];
            frequency[currentNumber] = currentFrequency + 1;
            // Dòng trên tương đương với: frequency[numbers[i]]++;
            System.out.println("frequency[currentNumber]: " + frequency[currentNumber]);
            System.out.println("currentFrequency: " + currentFrequency);
            System.out.println("frequency: " + Arrays.toString(frequency));
        }

        // In kết quả
        for (int i = 0; i <= max; i++) {
            if (frequency[i] > 0) {
                System.out.print(i + " - " + frequency[i]);
                if (i < max) {
                    System.out.print("; ");
                }
            }
        }

        scanner.close();
    }
}