import java.util.Scanner;

public class sumofno {
    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();

        int result = sum(a, b);
        System.out.println("The Result is "+ result);
      
        

    
        
    }
}