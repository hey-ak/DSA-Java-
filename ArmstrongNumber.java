import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int number) {
        int ogn = number;
        int sum = 0;
        while (number > 0) {
            int nm = number % 10;
            number = number / 10;
            int cube = nm * nm * nm;
            sum = sum + cube;

        }
        if (sum == ogn) {
            return true;

        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = input.nextInt();
        boolean ans = isArmstrong(number);
        System.out.println(ans);

    }
    
}
