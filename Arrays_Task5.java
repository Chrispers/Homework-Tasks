import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task5 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] <= arr[j])
                    break;
                else if(j == arr.length - 1)
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
}
