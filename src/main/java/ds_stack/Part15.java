package ds_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
    Cho một sâu s chỉ gồm các ký tự viết thường, hãy viết hàm trả về chuỗi mã hóa của sâu này.
    Xem ví dụ để hiểu rõ hơn quá trình mã hóa.example: aaabbaaac -> a3b2a3c1
*/
public class Part15 {
    public static void main(String[] args) throws IOException {
        Deque<Character> stack = new ArrayDeque<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] convertStringToArray = input.toCharArray();

        StringBuilder temp = new StringBuilder();
        int n = 0;
        while (n < convertStringToArray.length) {
            if (stack.isEmpty() || stack.peek() == convertStringToArray[n]) {
                stack.push(convertStringToArray[n]);
            } else {
                int count = 0;
                temp.append(stack.peek());
                while (!stack.isEmpty()) {
                    count++;
                    stack.pop();
                }
                temp.append(count);
                stack.push(convertStringToArray[n]);
            }
            n++;
            if (n >= convertStringToArray.length) {
                int count = 1;
                temp.append(stack.peek()).append(count);
            }
        }
        System.out.println(temp.toString());

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
