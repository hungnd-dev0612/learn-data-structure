package ds_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Part19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder emptyString = new StringBuilder();
        Vector<Integer> memory = new Vector<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                memory.add(arr[i]);
            }
        }


        if (!memory.contains(arr[arr.length - 1])) {
            memory.add(arr[arr.length - 1]);
        }

        for (int i = 0; i < memory.size(); i++) {
            queue.offer(memory.get(i));
        }
        int screen = Integer.parseInt(reader.readLine());
        if (queue.size() > screen) {
            queue.poll();
        }
        while (!queue.isEmpty()) {
            emptyString.append(queue.poll()).append(" ");
        }
        System.out.print(emptyString);
    }
}
