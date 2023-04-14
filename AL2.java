import java.util.ArrayList;
import java.util.Scanner;

public class AL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Elements of ArrayList");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());

        }
        // for printing we can Also Use
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));

        }
        // System.out.println(list);
    }
    
}
