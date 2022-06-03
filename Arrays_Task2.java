import java.util.Scanner;

public class Arrays_Task2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String stringOne = scanner.nextLine();
        scanner.nextLine();                                 // Added due to scanner issue on Java IDE
        String stringTwo = scanner.nextLine();
        String arrayOne[] = stringOne.split(" ");
        String arrayTwo[] = stringTwo.split(" ");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                if(arrayTwo[i].equals(arrayOne[j]))         // Check if there is a match via double if
                    System.out.print(arrayTwo[i] + " ");
            }
        }
    }
}
