import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task8 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.next());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == number)
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
