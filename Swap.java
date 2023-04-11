import java.util.Scanner;

public class Swap {
    static void swapnum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;


        System.out.println(a+" "+b);
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();
        System.out.println("Before Swap");
        System.out.println(a + " " + b);
        System.out.println("Afrer Swap");
        swapnum(a, b);
        
    }

    
}
