import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task6 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempRight = 0, tempLeft = 0;
            for (int l = 0; l < i; l++) {
                tempLeft += arr[l];
            }
            for (int r = i + 1; r < arr.length; r++) {
                tempRight += arr[r];
            }
            if(tempLeft == tempRight) {
                System.out.println(i);
                flag++;
            }
        }
        if(flag == 0)
            System.out.println("no");
    }
}
