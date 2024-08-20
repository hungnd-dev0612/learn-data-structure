import lombok.extern.log4j.Log4j2;


@Log4j2
public class Part1 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int size = scan.nextInt();
        // int[] array = new int[size];
        // int result = 0;
        // for (int i = 0; i < size; i++) {
        //     int input = new Scanner(System.in).nextInt();
        //     array[i] = input;
        //     result += array[i];
        // }
        // System.out.println("result: " + result);
       Part1 part = new Part1();
       part.test();
    }
    public void test (){
        int array [] = new int [5];
        for(int x:array){
            System.out.println("x: "+ x);
        }
    }
}
