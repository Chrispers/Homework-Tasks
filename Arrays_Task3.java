import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n];
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                arrayOne[i] = Integer.parseInt(scanner.next());
                arrayTwo[i] = Integer.parseInt(scanner.next());
            }else{
                arrayTwo[i] = Integer.parseInt(scanner.next());
                arrayOne[i] = Integer.parseInt(scanner.next());
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
    }
}
