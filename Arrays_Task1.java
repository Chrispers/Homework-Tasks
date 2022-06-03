import java.util.Scanner;

public class Arrays_Task1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.next());
        int[] people = new int[wagons];
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(scanner.next());   //Fill the String
            sum += people[i];
        }
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i] + " ");              //Read tje String
        }
        System.out.println();
        System.out.println(sum);
    }
}
