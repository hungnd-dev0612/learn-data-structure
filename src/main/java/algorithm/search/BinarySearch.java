package algorithm.search;

public class BinarySearch {
    public static void main(String[] args) {
        int low, mid, high, getDistence, resultBetween;
        int[] arr = new int[]{7
                , 13
                , 15
                , 17
                , 19
                , 19
                , 21
                , 34
                , 45
                , 49
                , 49
                , 53
                , 75
                , 79
                , 89
                , 92};
        low = 0;
        high = arr.length - 1;
        mid = (low + high) / 2;
        int x = 53;
        for (int i = low; i < high; i++) {
            if (arr[mid] == x) {
                System.out.println("return element x = " + arr[mid] + " at index "+ mid);
                break;
            } else if (arr[mid] > x) {
                System.out.println("mid > x");
                high = getIndex(mid) - 1;
                mid = (low + high) / 2;
            } else if (arr[mid] < x) {
                low = getIndex(mid) + 1;
                mid = (low + high) / 2;
            } else if (low == x || high == x) {
                System.out.println("return  x = " + arr[mid]);
                break;
            }else {
                System.out.println("not found - 1");
            }
        }

    }

    public static int getIndex(int target) {
        return target;
    }

}
