import java.util.Scanner;

public class MaxMin {
    static void findMaxMin(int num1, int num2, int num3) {
        int max = num1;
        int min = num2;
        if (num2 > max) {
            max = num2;
        } else if (num2 < min) {
            min = num2;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        findMaxMin(a, b, c);
    }
}