import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task4 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String[] newArray = new String[array.length];
        int rotations = Integer.parseInt(scanner.next());
        if(rotations >= array.length)
            rotations -= array.length;
        for (int i = 0; i < array.length; i++) {
            if(i - rotations >= 0){
                newArray[i - rotations] = array[i];
            }else {
                newArray[newArray.length - rotations + i] = array[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
