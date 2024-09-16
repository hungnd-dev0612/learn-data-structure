package ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
    Nhập vào một số nguyên dương n.
    Hãy chuyển n thành mã nhị phân và in chuỗi đó ra màn hình.
*/
public class Part14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String binary = convertToBinary(Integer.parseInt(input));
        String reverse = reversedSTack(binary);
        System.out.println(reverse);
    }

    public static String convertToBinary(int input) {
        StringBuilder binary = new StringBuilder();
        while (input > 0) {
            binary.append(input % 2);
            input /= 2;
        }
        return binary.toString();
    }

    public static String reversedSTack(String binaryStack) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder reversed = new StringBuilder();
        for (char getChar : binaryStack.toCharArray()) {
            stack.push(getChar);
        }
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
