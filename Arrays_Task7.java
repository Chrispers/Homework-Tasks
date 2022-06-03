import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task7 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int position = 0, counter = 0, tempCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    tempCounter++;                   // find the longest sequence in the array
                else
                    break;
            }
            if(tempCounter > counter){
                position = i;                        //find the position from which to start
                counter = tempCounter;
            }
            tempCounter = 0;
        }
        for (int i = position; i < position + counter + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
