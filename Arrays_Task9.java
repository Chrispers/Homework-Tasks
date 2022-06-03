import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task9 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = " ";
        do{
            String[] action = scanner.nextLine().split(" ");
            command = action[0];
            if(command.equals("swap")){
                int temp = arr[Integer.parseInt(action[1])];
                arr[Integer.parseInt(action[1])] = arr[Integer.parseInt(action[2])];
                arr[Integer.parseInt(action[2])] = temp;
            }
            if(command.equals("multiply")){
                arr[Integer.parseInt(action[1])] *= arr[Integer.parseInt(action[2])];
            }
            if(command.equals("decrease")){
                for (int i = 0; i < arr.length; i++) {
                    arr[i] -= 1;
                }
            }
        } while(!command.equals("end"));
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }
}
