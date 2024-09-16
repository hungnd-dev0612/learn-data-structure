package ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/*
    Cho một string, nhiệm vụ của bạn là in chuỗi đảo ngược của string đó ra màn hình bằng cách dùng stack.
*/
public class Part13 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println(reverseString(input));
    }

    public static String  reverseString(String input) {
        Deque<Character> stack = new ArrayDeque<>(input.length());
        StringBuilder reverse = new StringBuilder(input.length());
        for (char alphabet : input.toCharArray()) {
            stack.push(alphabet);
        }
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
