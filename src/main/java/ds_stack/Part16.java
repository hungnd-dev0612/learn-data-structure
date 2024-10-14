package ds_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Part16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < n; i++) {
            if(isPrimeNum(i) && isSuperPrime(i)) {
                queue.add(i);
            }
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.poll()+" ");
        }
    }
    public static boolean isPrimeNum(int n) {
        if(n < 2){
            return false;
        } else if (n==2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++ ) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isSuperPrime(int number) {
        String numString = String.valueOf(number);
        for (int i = numString.length(); i > 0; i--) {
            int subNumber = Integer.parseInt(numString.substring(0, i));
            if (!isPrimeNum(subNumber)) {
                return false;
            }
        }
        return true;
    }
}