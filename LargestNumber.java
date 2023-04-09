import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = input.nextInt();
      System.out.println("Enter Second Number: ");
      int b = input.nextInt();
      System.out.println("Enter Third Number: ");
      int c = input.nextInt();
        

      int max = Math.max(c, Math.max(a, b));
    //   int max = a;
    //   if (b > max) {
    //       max = b;

    //   }
    //    if (c > max) {
    //       max = c;
    //   }
      System.out.println("MAX: " + max);
    }
    
}
