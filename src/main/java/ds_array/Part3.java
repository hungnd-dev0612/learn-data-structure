package ds_array;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Part3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        for (int i = 0; i < length; i++) {
            int value = scan.nextInt();
            System.out.print((value * value) + " "); // Tính và in ra giá trị bình phương
        }

        scan.close();
    }
}
