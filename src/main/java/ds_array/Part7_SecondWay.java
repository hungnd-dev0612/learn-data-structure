package ds_array;

import java.util.Scanner;

public class Part7_SecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
//          hoac co the viet nhu nay
//          frequency[numbers[i]]++; --> 3 dong tren gom thanh 1 dong nay
        }

        // In kết quả
        for (int i = 0; i <= max; i++) {
            if (frequency[i] > 0) {
                System.out.print(i + " - " + frequency[i]);
                    System.out.print("; ");
            }
        }

        scanner.close();
    }
}