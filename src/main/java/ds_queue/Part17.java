package ds_queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
    Nhập vào một số nguyên dương n, tiếp theo nhập n số nguyên lần lượt là các phần tử của queue. Cuối cùng nhập vào một số tự nhiên k.
    Một phép biến đổi sẽ dịch chuyển phần tử đầu tiên ra sau phần tử cuối cùng của dãy, hãy trả về dãy sau khi đã biến đổi k lần.
    In tất cả các phần tử ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
 */
public class Part17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        nhap do dai element queue
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.valueOf(reader.readLine()));
        }

//        nhap so lan bien doi k
        int k = Integer.parseInt(reader.readLine());
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll());
        }
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            result.append(queue.poll()).append(" ");
        }
        System.out.println(result);
    }
}
