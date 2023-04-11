import java.util.Scanner;

public class primeusingfunc {

    static boolean isprime(int a) {
        if (a <= 1) {
            return false;

        }
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                return false;

            }
            c++;

        }
        return c * c >= a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = input.nextInt();
      boolean ans =  isprime(a);
      System.out.println(ans);

    }
    
}
