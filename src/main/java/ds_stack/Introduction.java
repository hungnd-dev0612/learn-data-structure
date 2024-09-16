package ds_stack;

import java.util.Scanner;
import java.util.Stack;

public class Introduction {
    public static void main(String[] args) {
        /*
        -Stack la mot ngan xep co cach hoat dong la LIFO -> Last in first out
        -Store objects o ben trong nhu mot cai thap, stack co 5 method
        -STACK DUOC SU DUNG TRONG THUC TE: udo/redo tren text editor,2 cai nut trai phai tren browser, backtracking algorithm, (call function -> call stack)
        push: them phan tu vao stack
        pop: truy xuat phan tu do, tra ve phan tu do va xoa ra khoi stack
        peek: truy xuat phan tu do va tra ve phan tu da truy xuat
        search: tim kiem vi tri phan tu, tra ve index, -1 if not exists
        empty: kiem tra xem stack co empty hay ko, false neu ko va true neu empty

         */

//        Stack<String> stack = new Stack<>();
//        stack.push("hihi1");
//        stack.push("hihi2");
//        stack.push("hihi3");
//        System.out.println(stack);
//        System.out.println(stack.empty());
//        Stack<String> stack = new Stack<>();
//        String input = "codelearn";
//        String reverse = "";
//        char[] changeInputToArray = input.toCharArray();
//        for (int i = 0; i < changeInputToArray.length; i++) {
//            stack.push(String.valueOf(changeInputToArray[i]));
//        }
//        for (int i = stack.size(); i > 0; i--) {
//            reverse += stack.pop();
//        }
//        System.out.println(stack.size());
//        System.out.println(reverse);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverseString = reverseString(input);
        System.out.println(reverseString);
    }

    public static String reverseString(String input) {
        Stack<String> stack = new Stack<>();
        String reverse = "";
        char[] changeInputToArray = input.toCharArray();
        for (int i = 0; i < changeInputToArray.length; i++) {
            stack.push(String.valueOf(changeInputToArray[i]));
        }
        for (int i = stack.size(); i > 0; i--) {
            reverse += stack.pop();
        }
        return reverse;
    }
}
