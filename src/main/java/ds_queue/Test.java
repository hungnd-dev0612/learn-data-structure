package ds_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Nhập số lượng tin nhắn
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Vector<Integer> memory = new Vector<>();

        // Nhập các tin nhắn
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        // Nhập giới hạn màn hình
        int screen = Integer.parseInt(reader.readLine());

        // Duyệt qua từng tin nhắn
        for (int i = 0; i < n; i++) {
            int phoneNumber = arr[i];

            // Kiểm tra xem số điện thoại đã có trên màn hình chưa
            if (!memory.contains(phoneNumber)) {
                // Nếu màn hình đã đầy, loại bỏ tin nhắn đầu tiên
                if (queue.size() == screen) {
                    int removedNumber = queue.poll();  // Loại bỏ tin nhắn cũ nhất
                    memory.remove(Integer.valueOf(removedNumber)); // Xóa số điện thoại khỏi vector
                }
                // Thêm số điện thoại mới vào hàng đợi và vector
                queue.offer(phoneNumber);
                memory.add(phoneNumber);
            }
        }

        // In kết quả
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            result.append(queue.poll()).append(" ");  // Thêm khoảng trắng giữa các tin nhắn
        }

        // In ra kết quả
        System.out.print(result.toString());

    }
}
