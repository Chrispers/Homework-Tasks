import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task10 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String[] loot = scanner.nextLine().split("\\|");
        String[] action;
        String[] newArr;
        do{
            action = scanner.nextLine().split(" ");
            if(action[0].equals("Loot")){
                for (int i = 1; i < action.length; i++) {
                    for (int j = 0; j < loot.length; j++) {
                        if(loot[j].equals(action[i])){
                            break;
                        }
                        if(j == loot.length - 1){
                            newArr = new String[loot.length];
                            newArr[0] = action[i];
                            for (int k = 1; k < loot.length; k++) {
                                newArr[k - 1] = loot[k];
                            }
                            System.out.println("added");
                        }
                    }
                }
            }
        }while(!action[0].equals("Yohoho!"));
    }
}


