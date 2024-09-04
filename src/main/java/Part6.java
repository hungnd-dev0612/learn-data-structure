import java.util.Arrays;
import java.util.Scanner;

public class Part6 {
    /*
    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
    Hãy in lần lượt các số nguyên tố có trong dãy a ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
    (Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó. Số a được gọi là ước của b nếu b chia hết cho a).
    Biết rằng dãy sẽ có ít nhất một số nguyên tố.
    Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập độ dài mảng: ");

        int n = scan.nextInt();
        int[] array = new int[n];
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử mảng: ");
            array[i] = scan.nextInt();
        }
//        System.out.println("Nhập phần tử k: ");
        String emptyString = "";
        for(int i = 0;i < n; i ++){
            if(isPrime(array[i])){
                emptyString = emptyString.concat(String.valueOf(array[i])).concat(" ");
            }
        }
        System.out.println(emptyString);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
