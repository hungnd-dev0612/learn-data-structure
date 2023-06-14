import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Scanner;

@Log4j2
public class Part4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap length: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu: ");
            array[i] = scan.nextInt();
        }
        System.out.println("nhap k: ");
        int k = scan.nextInt();
        System.out.println("nhap x: ");
        int x = scan.nextInt();
        int[] newArray = new int[array.length + 1];

        if (k <= n && k >= 0) {
            for (int i = 0; i < newArray.length - 1; i++) {
                if (array[i] == k) {
                    newArray[i + 1] = x;
                } else {
                    newArray[i] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}
