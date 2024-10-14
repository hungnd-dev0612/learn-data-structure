package ds_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
Hãy in lần lượt các số nguyên tố có trong dãy a ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
(Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó. Số a được gọi là ước của b nếu b chia hết cho a).
Biết rằng dãy sẽ có ít nhất một số nguyên tố.
Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó
*/
public class Part18 {
//    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder emptyString = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && isSuperPrime(i)) {
                queue.offer(i);
            }
        }
        System.out.println("queue before check super prime: " + queue);
        while (!queue.isEmpty()) {
            emptyString.append(queue.poll()).append(" ");
        }
        System.out.println("queue after check super prime: " + emptyString);
    }

//    public static int intBuffer() throws IOException {
//        return Integer.parseInt(reader.readLine());
//    }
//
//    public static String stringBuffer() throws IOException {
//        return String.valueOf(reader.readLine());
//    }

    public static boolean isPrime(int input) {
        if (input < 2) {
            return false;
        }
        if (input == 2 || input == 3) return true;
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    public static boolean isSuperPrime(int input) {
        String convertToNumber = String.valueOf(input);
        int length = convertToNumber.length();
        int n = 0;
        while (n < length) {
            if (!isPrime(input)) {
                return false;
            }
            input /= 10;
            n++;
        }
        return true;
//        String numString = String.valueOf(input);
//        for (int i = numString.length(); i > 0; i--) {
//            int subNumber = Integer.parseInt(numString.substring(0, i));
//            System.out.println("subNumber: "+subNumber);
//            if (!isPrime(subNumber)) {
//                return false;
//            }
//        }
//        return true;
    }
}
