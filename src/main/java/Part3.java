import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Part3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            array[i] *= array[i];
        }
        String concat = "";
        for(int i : array){
            String temp = String.valueOf(i);
            concat = concat.concat(String.valueOf(i)).concat(" ");
        }
    }

}
